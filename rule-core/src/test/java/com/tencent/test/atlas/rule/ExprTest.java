package com.tencent.test.atlas.rule;

import com.tencent.atlas.exec.expr.ExpressionExecution;
import com.tencent.atlas.exec.expr.ExpressionExecution.AtlasExprException;
import com.tencent.atlas.exec.rule.RuleExecution;
import com.tencent.atlas.expr.Predicate;
import com.tencent.atlas.feature.org.apache.commons.lang3.StringUtils;
import com.tencent.atlas.model.Row;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ExprTest {

    @Mock
    private Row row;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ExpressionExecution.registerResolver(LogTestResolver.class);
    }

    /**
     * $$a<20 $$a>-10
     */
    @Test
    public void testGt() {
        Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(10);
        assert RuleExecution.exec("$$a<20", row);
        assert RuleExecution.exec("$$a>-10", row);
    }

    /**
     * $$a > 100 and $$b/$$a > 0.8 and $$client<6.0 and $$download = '应用宝'
     */
    @Test
    public void testRule0() {
        Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(101);
        Mockito.when(row.getByName(Mockito.eq("b"))).thenReturn(81);
        Mockito.when(row.getByName(Mockito.eq("client"))).thenReturn(1.0);
        Mockito.when(row.getByName(Mockito.eq("download"))).thenReturn("应用宝1");
        assert !RuleExecution
                .exec("$$a > 100 and $$b/$$a > 0.8 and $$client<6.0 and $$download = '应用宝'", row);
        Mockito.when(row.getByName(Mockito.eq("download"))).thenReturn("应用宝");
        assert RuleExecution
                .exec("$$a > 100 and $$b/$$a > 0.8 and $$client<6.0 and $$download = '应用宝'", row);
    }

    /**
     * $$u_d > 2 and $$u_2 >2 and $$comment rlike '.+[a-zA-Z]+.+'
     */
    @Test
    public void testRule1() {
        Mockito.when(row.getByName(Mockito.eq("u_d"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("u_2"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("abc应用宝");
        assert RuleExecution
                .exec("$$u_d > 2 and $$u_2 >2 and $$comment rlike '.+[a-zA-Z]+.+'", row);
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("应用宝");
        assert !RuleExecution
                .exec("$$u_d > 2 and $$u_2 >2 and $$comment rlike '.+[a-zA-Z]+.+'", row);
    }

    /**
     * $$u_d > 2 or $$u_2 >2 or $$comment rlike '.+[a-zA-Z]+.+'
     */
    @Test
    public void testOr() {
        Mockito.when(row.getByName(Mockito.eq("u_d"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("u_2"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("abc应用宝");
        assert RuleExecution
                .exec("$$u_d > 2 or $$u_2 >2 or $$comment rlike '.+[a-zA-Z]+.+'", row);
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("应用宝");
        Mockito.when(row.getByName(Mockito.eq("u_d"))).thenReturn(1);
        assert RuleExecution
                .exec("$$u_d > 2 or $$u_2 >2 or $$comment rlike '.+[a-zA-Z]+.+'", row);
        Mockito.when(row.getByName(Mockito.eq("u_2"))).thenReturn(1);
        assert !RuleExecution
                .exec("$$u_d > 2 or $$u_2 >2 or $$comment rlike '.+[a-zA-Z]+.+'", row);
    }

    /**
     * char_length($$comment)>1 substr($$comment,1)
     */
    @Test
    public void testRule2() {
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("abc应用宝");
        assert RuleExecution.exec("char_length($$comment)=6", row);
        assert !RuleExecution.exec("char_length($$comment)>10", row);
        assert RuleExecution.exec("substr($$comment,1)='bc应用宝'", row);
        assert RuleExecution.exec("substr($$comment,1,2)='bc'", row);
        assert RuleExecution.exec("substr($$comment,1,3)='bc应'", row);
        assert RuleExecution.exec("substr($$comment,0,3)='abc'", row);
        assert RuleExecution.exec("substr($$comment,0,10)='abc应用宝'", row);
        assert RuleExecution.exec("substr($$comment,10,10)=''", row);
        assert RuleExecution.exec("substr($$comment,0,1)='a'", row);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExcept() {
        assert RuleExecution.exec("$$a", row);
    }

    /**
     * char_length($$item) > 8 and $$a > 5
     */
    @Test
    public void testRule3() {
        Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(10);
        Mockito.when(row.getByName(Mockito.eq("item"))).thenReturn("abc");
        assert !RuleExecution.exec("char_length($$item) > 8 and $$a > 5", row);
    }

    /**
     * $$a/$$b > 0.8 and char_length($$item) > 8
     */
    @Test
    public void testRule4() {
        Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(10);
        Mockito.when(row.getByName(Mockito.eq("b"))).thenReturn(20);
        Mockito.when(row.getByName(Mockito.eq("item"))).thenReturn("abcdefgh121");
        assert !RuleExecution.exec("$$a/$$b > 0.8 and char_length($$item) > 8", row);
        assert !RuleExecution.exec("($$a/$$b > 0.8) and (char_length($$item) > 8)", row);
        assert RuleExecution
                .exec("(($$a/$$b > 0.8) and (char_length($$item) > 8)) or ($$a/$$b < 0.8)", row);
    }

    /**
     * $$a > 15 and $$openid='' and $$b!='true'
     */
    @Test
    public void testRule5() {
        Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(11);
        Mockito.when(row.getByName(Mockito.eq("c"))).thenReturn(39);
        Mockito.when(row.getByName(Mockito.eq("d"))).thenReturn(14);
        Mockito.when(row.getByName(Mockito.eq("b"))).thenReturn("false");
        Mockito.when(row.getByName(Mockito.eq("openid"))).thenReturn("abcdefgh121");
        Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("要是我我会往地上倒掉油");
        assert RuleExecution.exec("$$comment!='' && $$comment!='null'", row);
        assert !RuleExecution.exec("$$a > 15 and $$openid='' and $$b!='true'", row);
    }

    /**
     * $$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and $$certificate!='cert'
     */
    @Test
    public void testRule6() {
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("abc求回关121");
        Mockito.when(row.getByName(Mockito.eq("nick"))).thenReturn("abc求回关121asdacas");
        Mockito.when(row.getByName(Mockito.eq("register"))).thenReturn(1);
        Mockito.when(row.getByName(Mockito.eq("c"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("certificate"))).thenReturn("ce");
        assert RuleExecution.exec(
                "$$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and $$certificate!='cert'",
                row);
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("求回关121");
        assert RuleExecution.exec(
                "$$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and $$certificate!='cert'",
                row);
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("求回关");
        assert RuleExecution.exec(
                "$$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and $$certificate!='cert'",
                row);
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("回关");
        assert !RuleExecution.exec(
                "$$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and $$certificate!='cert'",
                row);
    }

    /**
     * <ul>
     *     <li>case when $$nick_name like '%求回关%' then 1 end </li>
     *     <li>case when $$nick_name like '%求回关%' then 1 else 2 end </li>
     *     <li>case when $$nick_name like '%求回关%' then 1 when $$register=1 else 2 else 3 end</li>
     * </ul>
     */
    @Test
    public void caseWhenTest() {
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("abc求回关121");
        Mockito.when(row.getByName(Mockito.eq("nick"))).thenReturn("abc求回关121asdacas");
        Mockito.when(row.getByName(Mockito.eq("register"))).thenReturn(1);
        Mockito.when(row.getByName(Mockito.eq("c"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("certificate"))).thenReturn("ce");
        assert ((Number) ExpressionExecution.exec("case when $$nick_name like '%求回关c%' then 2 end", row)
                .defaultIfEmpty(-99).block()).intValue() == -99;
        assert ((Number) ExpressionExecution.exec("case when $$nick_name like '%求回关c%' then 2 else 1 end", row).block())
                .intValue()
                == 1;
        assert ((Number) ExpressionExecution
                .exec("case when $$nick_name like '%求回关c%' then 1 when $$register=1 then 2 else 3 end", row).block())
                .intValue()
                == 2;
    }

    /**
     * <ul>
     *     <li>if $$nick_name like '%求回关%' then 1 end if</li>
     *     <li>if $$nick_name like '%求回关c%' then 1 else 2 end if</li>
     * </ul>
     */
    @Test
    public void ifElseTest() {
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("abc求回关121");
        Mockito.when(row.getByName(Mockito.eq("nick"))).thenReturn("abc求回关121asdacas");
        Mockito.when(row.getByName(Mockito.eq("register"))).thenReturn(1);
        Mockito.when(row.getByName(Mockito.eq("c"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("certificate"))).thenReturn("ce");
        assert ((Number) ExpressionExecution.exec("if $$nick_name like '%求回关%' then 1 end if", row).block()).intValue()
                == 1;
        assert ((Number) ExpressionExecution
                .exec("if $$nick_name like '%求回关c%' then 1 else 2 end if", row).block())
                .intValue()
                == 2;
    }

    @Test
    public void testTreeStr() {
        Predicate expr = RuleExecution.compileAndResolve("$$nick_name like '%求回关%'");
        assert StringUtils.equals(expr.treeString(), "|-Like\n"
                + "\t|-AttributeRef\n"
                + "\t-StringLiteral\n");
    }

    @Test(expected = NullPointerException.class)
    public void testEvalFeature() {
        assert !RuleExecution.exec("**nick_name like '%求回关%'", row);
    }

    @Test(expected = NullPointerException.class)
    public void testEvalDataView() {
        assert !RuleExecution.exec("@@nick_name(1,2) like '%求回关%'", row);
    }

    /**
     * support date format like below:
     * <ul>
     *     <li>datediff('20201026','20201026','dd')</li>
     *     <li>datediff('20201026','20201027 15:28:46','dd')</li>
     *     <li>datediff('20201025',1603697326000,'dd')</li>
     *     <li>datediff('20201026 15:28:46','20201027','dd')</li>
     *     <li>datediff('20201026 15:28:46','20201027','hh')</li>
     *     <li>datediff('20201026 15:28:46','20201026 16:28:46','dd')</li>
     *     <li>datediff('20201026 15:28:46','20201026 16:28:46','hh')</li>
     *     <li>datediff('20201026 15:28:46','20201026 16:28:46','mm')</li>
     *     <li>datediff('20201026 15:28:46','20201026 16:28:46','ss')</li>
     *     <li>datediff('20201025 15:28:46','1603697326000','dd')</li>
     *     <li>datediff('1603692807000','20201025','dd')</li>
     *     <li>datediff('1603692807000','20201027','dd')</li>
     *     <li>datediff('1603692807000','20201027 15:28:46','dd')</li>
     *     <li>datediff('1603692807000','1603692707000','dd')</li>
     *     <li>datediff('1603692807000','1603692707000','hh')</li>
     * </ul>
     */
    @Test
    public void testDateDiff() {
        assert (long) ExpressionExecution.exec("datediff(1603692807000,'20201027','dd')", null).block() == 0;
        assert (long) ExpressionExecution.exec("datediff(1603692807000,'20201025','dd')", null).block() == -1;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201027','hh')", null).block() == 8;
        assert (long) ExpressionExecution.exec("datediff('20201026','20201026','dd')", null).block() == 0;
        assert (long) ExpressionExecution.exec("datediff('20201026','20201027 15:28:46','dd')", null).block() == 1;
        assert (long) ExpressionExecution.exec("datediff('20201025',1603697326000,'dd')", null).block() == 1;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201027','dd')", null).block() == 0;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201026 16:28:46','dd')", null).block()
                == 0;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201026 16:28:46','hh')", null).block()
                == 1;
        assert (long) ExpressionExecution.exec("datediff('20201025 15:28:46','20201026 16:28:46','hh')", null).block()
                == 25;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201026 16:28:46','mm')", null).block()
                == 60;
        assert (long) ExpressionExecution.exec("datediff('20201026 15:28:46','20201026 16:28:46','ss')", null).block()
                == 3600;
        assert (long) ExpressionExecution.exec("datediff('20201025 15:28:46',1603697326000,'dd')", null).block() == 1;
        assert (long) ExpressionExecution.exec("datediff(1603692807000,'20201027 15:28:46','dd')", null).block() == 1;
        assert (long) ExpressionExecution.exec("datediff(1603692807000,1603692707000,'dd')", null).block() == 0;
        assert (long) ExpressionExecution.exec("datediff(1603519907000,1603692807000,'hh')", null).block() == 48;
        assert (long) ExpressionExecution.exec("datediff(1603692807000,1603519907000,'hh')", null).block() == -48;
    }

    /**
     * <ul>
     *     <li>case when datediff('20201026','20201027 15:28:46','dd')=1 then 2 else -2 end</li>
     * </ul>
     */
    @Test
    public void caseWhenDate() {
        assert ((Number) ExpressionExecution
                .exec("case when datediff('20201026','20201027 15:28:46','dd')=1 then 2 else -2 end", null).block())
                .intValue()
                == 2;
    }

    @Test
    public void testExprOrAndUdf() {
        Mockito.when(row.getByName(Mockito.eq("nick_name"))).thenReturn("abc求回关121");
        Mockito.when(row.getByName(Mockito.eq("nick"))).thenReturn("abc求回关121asdacas");
        Mockito.when(row.getByName(Mockito.eq("register"))).thenReturn(1);
        Mockito.when(row.getByName(Mockito.eq("c"))).thenReturn(3);
        Mockito.when(row.getByName(Mockito.eq("certificate"))).thenReturn("ce");
        assert ExpressionExecution.compile(
                "(@@follow_ip42uid($$client_ip4, $$uid, '60m', 'COUNT') / @@follow_ip42uid($$client_ip4, $$uid, '60m', 'DISTINCT_COUNT')) <= @@follow_uid2target($$uid, $$follow_uid, '60m', 'COUNT')")
                != null;
        assert ExpressionExecution
                .compile(
                        "@@follow_uid2target($$uid, $$follow_uid, \"1m\", \"COUNT\") > 30 and $$openid=\"\" and (regex_contain_udf(\"加微信|加qq|咨询我|联系我|关注我|看我头像|互关|回关|微我|\\+v|加微|进群|QQ群|交友|聊天\", $$user_name) or regex_contain_udf(\"[0-9a-zA-Z_]{6,11}\", $$user_name))")
                != null;
        assert ExpressionExecution
                .compile(
                        "@@follow_ip42uid($$client_ip4, $$uid, '60m', 'DISTINCT_COUNT') > 100 and @@follow_ip42uid($$client_ip4, $$uid, '60m', 'COUNT') / @@follow_ip42uid($$client_ip4, $$uid, '60m', 'DISTINCT_COUNT') > 20 and (regex_contain_udf('加微信|加qq|咨询我|联系我|关注我|看我头像|互关|回关|微我|\\+v|加微|进群|QQ群|交友|聊天', $$user_name) or regex_contain_udf('[0-9a-zA-Z_]{6,11}', $$user_name)) and @@follow_uid2target($$uid, $$follow_uid, '60m', 'COUNT') >= (@@follow_ip42uid($$client_ip4, $$uid, '60m', 'COUNT') / @@follow_ip42uid($$client_ip4, $$uid, '60m', 'DISTINCT_COUNT'))")
                != null;

    }

    @Test(expected = AtlasExprException.class)
    public void testExprAnd() {
        assert RuleExecution.compileAndResolve("$$openid = '' aaannnv}") instanceof Predicate;

    }

    @Test
    public void testInList() {
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn("1");
        assert RuleExecution.compileAndResolve("$$uid IN ('1','2','3')").eval(row).block();
        assert !RuleExecution.compileAndResolve("$$uid not IN ('1','2','3')").eval(row).block();
        assert RuleExecution.compileAndResolve("$$uid not IN ('4','2','3')").eval(row).block();
        assert !RuleExecution.compileAndResolve("$$uid not IN ('1')").eval(row).block();
        assert RuleExecution.compileAndResolve("$$uid IN ('1')").eval(row).block();
        assert RuleExecution.compileAndResolve(
                "$$uid in (\"1\",\"1549027913587241\",\"1558447172147037\",\"1602341413517351\",\"1593654752636449\",\"1568981945997021\",\"1579472900065120\",\"1522481082683335\")")
                .eval(row).block();
    }

    @Test
    public void testInIntList() {
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn(1);
        assert RuleExecution.compileAndResolve("$$uid IN (1,2,3)").eval(row).block();
    }

    @Test
    public void testNotLike() {
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn("abc");
        assert RuleExecution.compileAndResolve("$$uid not like '%ddd%'").eval(row).block();
        assert RuleExecution.compileAndResolve("$$uid like '%a%'").eval(row).block();
    }

    @Test
    public void testIsNull() {
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn(null);
        assert RuleExecution.compileAndResolve("$$uid is null").eval(row).block();
        assert !RuleExecution.compileAndResolve("$$uid is not null").eval(row).block();
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn("1");
        assert RuleExecution.compileAndResolve("$$uid is not null").eval(row).block();
    }

    @Test
    public void testIsTrue() {
        Mockito.when(row.getByName(Mockito.eq("uid"))).thenReturn("abc");
        assert RuleExecution.compileAndResolve("$$uid not like '%ddd%'").eval(row).block();
        assert RuleExecution.compileAndResolve("$$uid like '%a%'").eval(row).block();
    }

    @Test
    public void testTrimExpr() {
        assert RuleExecution
                .compileAndResolve("@@follow_uid2target($$uid, $$target, '60m', 'COUNT') > 150 and $$openid=''" +
                        " and (@@person_wide_table($$uid,\"nick\") rlike '加微信|加qq|咨询我|联系我|关注我|看我头像|互关|回关|微我|\\+v|加微|进群|QQ群|交友|聊天' "
                        +
                        "or @@person_wide_table($$uid,\"nick\") rlike '[0-9a-zA-Z_]{6,11}')\n"
                        + "    ") instanceof Predicate;
        assert RuleExecution.compileAndResolve("$$openid = ''") instanceof Predicate;
    }

}
