package com.tencent.test.atlas.rule;

import com.tencent.atlas.feature.com.google.common.collect.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class ReactorTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReactorTest.class);

    @Test
    public void threadPrintMain() {
        Flux.fromIterable(Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).flatMap(i -> {
            System.out.println("current thread name" + Thread.currentThread().getName());
            return Mono.justOrEmpty(i * 2);
        }).flatMap(i -> {
            System.out.println("current thread name" + Thread.currentThread().getName());
            return Mono.justOrEmpty(i * 2);
        }).subscribeOn(Schedulers.immediate()).subscribe();
    }

    @Test
    public void threadPrintParallel() {
        Flux.fromIterable(Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).flatMap(i -> {
            System.out.println("v0 current thread name" + Thread.currentThread().getName());
            return Mono.justOrEmpty(i * 2);
        }).publishOn(Schedulers.elastic()).flatMap(i -> {
            System.out.println("v1 current thread name" + Thread.currentThread().getName());
            return Mono.justOrEmpty(i * 2);
        }).subscribeOn(Schedulers.parallel()).blockLast();
    }

    @Test
    public void threadPrintInnerParallel() {
        Flux.range(1, 1000).flatMap(i -> {
            System.out.println("v0 current thread name" + Thread.currentThread().getName());
            return Mono.justOrEmpty(i * 2);
        }).flatMap(i -> {
            System.out.println("v1 current thread name" + Thread.currentThread().getName());
            return Flux.just(i * 2, i * 3);
        }).subscribeOn(Schedulers.parallel()).blockLast();
    }

    @Test
    public void testPrintThread() {
        Flux.just("tom")
                .map(s -> {
                    System.out.println("[map] Thread name: " + Thread.currentThread().getName());
                    LOGGER.info("[map] Thread name: " + Thread.currentThread().getName());
                    return s.concat("@mail.com");
                })
                .publishOn(Schedulers.newElastic("thread-publishOn"))
                .filter(s -> {
                    System.out.println("[filter] Thread name: " + Thread.currentThread().getName());
                    return s.startsWith("t");
                })
                .subscribeOn(Schedulers.newElastic("thread-subscribeOn"))
                .subscribe(s -> {
                    System.out.println("[subscribe] Thread name: " + Thread.currentThread().getName());
                    System.out.println(s);
                });
    }
}
