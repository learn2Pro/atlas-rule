package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.ann.UDF;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.feature.com.google.common.base.Preconditions;
import com.tencent.atlas.feature.org.apache.commons.lang3.StringUtils;
import com.tencent.atlas.model.Row;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import reactor.core.publisher.Mono;

/**
 * support date format like below:
 * <ul>
 *     <li>datediff('yyyyMMdd','yyyyMMdd','dd')</li>
 *     <li>datediff('yyyyMMdd',1603692807000,'dd')</li>
 *     <li>datediff('yyyyMMdd HH:mm:ss','yyyyMMdd','dd')</li>
 *     <li>datediff('yyyyMMdd HH:mm:ss','yyyyMMdd HH:mm:ss','dd')</li>
 *     <li>datediff('yyyyMMdd HH:mm:ss','1603692807000','dd')</li>
 *     <li>datediff('1603692807000','yyyyMMdd','dd')</li>
 *     <li>datediff('1603692807000','yyyyMMdd HH:mm:ss','dd')</li>
 *     <li>datediff('1603692807000','1603692807000','dd')</li>
 * </ul>
 */
@UDF({"datediff", "DATEDIFF"})
public class DateDiffRunner implements UDFRunner<Long> {


    /**
     * eval the date diff between two date
     *
     * @param row the input row
     * @param group the param group
     * @return the diff size
     */
    @Override
    public Mono<Long> eval(Row row, ExpressionGroup group) {
        Expression<?> fromDate = group.get(0);
        Expression<?> toDate = group.get(1);
        Mono<DateUnit> unit =
                group.get(2) == null ? Mono.justOrEmpty(DateUnit.DD)
                        : group.get(2).eval(row).map(symbol -> DateUnit.of((String) symbol));
        return Mono.zip(fromDate.eval(row), toDate.eval(row), unit)
                .map(tuple3 -> {
                    LocalDateTime from = getLocalDate(tuple3.getT1());
                    LocalDateTime to = getLocalDate(tuple3.getT2());
                    switch (tuple3.getT3()) {
                        case DD:
                            return ChronoUnit.DAYS.between(from, to);
                        case HH:
                            return ChronoUnit.HOURS.between(from, to);
                        case MM:
                            return ChronoUnit.MINUTES.between(from, to);
                        case SS:
                            return ChronoUnit.SECONDS.between(from, to);
                    }
                    return 0L;
                });
    }

    private LocalDateTime getLocalDate(Object time) {
        if (time instanceof Number) {
            return LocalDateTime
                    .ofInstant(Instant.ofEpochMilli(((Number) time).longValue()), TimeZone.getDefault().toZoneId());
        } else if (time instanceof String) {
            return parseByDate((String) time);
        }
        return LocalDateTime.now();
    }

    private LocalDateTime parseByDate(String date) {
        Preconditions.checkArgument(StringUtils.isNotBlank(date) && (date.length() == 8 || date.length() == 17),
                "date format must in yyyyMMdd or yyyyMMdd HH:mm:ss");
        if (date.length() == 8) {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd")).atStartOfDay();
        } else if (date.length() == 17) {
            return LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"));
        }
        throw new UnsupportedOperationException("not support this date format!====>" + date);
    }

    static enum DateUnit {
        /**
         * day unit
         */
        DD(TimeUnit.DAYS, "dd"),
        /**
         * hour unit
         */
        HH(TimeUnit.HOURS, "hh"),
        /**
         * minute unit
         */
        MM(TimeUnit.MINUTES, "mm"),
        /**
         * second unit
         */
        SS(TimeUnit.SECONDS, "ss");
        private TimeUnit tu;
        private String symbol;

        DateUnit(TimeUnit tu, String symbol) {
            this.tu = tu;
            this.symbol = symbol;
        }

        /**
         * find the matched {@link DateUnit}
         *
         * @param symbol the symbol
         * @return unit
         */
        public static DateUnit of(String symbol) {
            for (DateUnit unit : DateUnit.values()) {
                if (unit.symbol.equals(symbol)) {
                    return unit;
                }
            }
            throw new IllegalArgumentException("this type [" + symbol + "]of date unit not support!");
        }
    }
}
