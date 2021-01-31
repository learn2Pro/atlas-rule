package com.tencent.test.atlas.rule;

import com.tencent.atlas.exec.expr.ExpressionExecution;
import com.tencent.atlas.feature.org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class ExprSymbolTest {


    @Test
    public void testRefSymbol() {
        String s0 = "$$a", s1 = "**c", s2 = "@@dm(1, 2)";
        assert StringUtils.equals(s0, ExpressionExecution.compile(s0).symbol());
        assert StringUtils.equals(s1, ExpressionExecution.compile(s1).symbol());
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
    }

    /**
     * $$a<20 $$a>-10
     */
    @Test
    public void testCmpSymbol() {
        String s0 = "$$a<20", s1 = "$$a<-10", s2 = "@@dm(1, 2)<=10", s3 = "**c=5", s4 = "**c>11", s5 = "**c>=-10";
        assert StringUtils.equals(s0, ExpressionExecution.compile(s0).symbol());
        assert StringUtils.equals(s1, ExpressionExecution.compile(s1).symbol());
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
        assert StringUtils.equals(s5, ExpressionExecution.compile(s5).symbol());
    }

    /**
     * $$a<20 $$a>-10
     */
    @Test
    public void testBitSymbol() {
        String s0 = "$$a&20", s1 = "$$a&-10", s2 = "@@dm(1, 2)|10", s3 = "**c>>5", s4 = "**c<<11";
        assert StringUtils.equals(s0, ExpressionExecution.compile(s0).symbol());
        assert StringUtils.equals(s1, ExpressionExecution.compile(s1).symbol());
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
    }

    /**
     * $$a<20 $$a>-10
     */
    @Test
    public void testUdfSymbol() {
        String s0 = "SUBSTR('2121', 1)", s1 = "SUBSTR('2121', 1, 2)", s2 = "SUBSTR(**a, 1, 2)", s3 = "SUBSTR(@@dm(1, 2), 1, 2)", s4 = "SUBSTR($$c, 1, 2)";
        assert StringUtils.equals(s0, ExpressionExecution.compile(s0).symbol());
        assert StringUtils.equals(s1, ExpressionExecution.compile(s1).symbol());
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
    }

    @Test
    public void testLiteralSymbol() {
        String s2 = "NULL", s3 = "NOT NULL", s4 = "1.0", s5 = "1", s6 = "'123'";
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
        assert StringUtils.equals(s5, ExpressionExecution.compile(s5).symbol());
        assert StringUtils.equals(s6, ExpressionExecution.compile(s6).symbol());
    }

    @Test
    public void testLogicSymbol() {
        String s2 = "**a>10 AND $$b<1", s3 = "**a>10 OR $$b<1", s4 = "NOT $$B<1";
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
    }

    @Test
    public void testMathSymbol() {
        String s0 = "**a+$$b", s1 = "**a-$$b", s2 = "**a*$$b", s3 = "**a/$$b", s4 = "**a%$$b";
        assert StringUtils.equals(s0, ExpressionExecution.compile(s0).symbol());
        assert StringUtils.equals(s1, ExpressionExecution.compile(s1).symbol());
        assert StringUtils.equals(s2, ExpressionExecution.compile(s2).symbol());
        assert StringUtils.equals(s3, ExpressionExecution.compile(s3).symbol());
        assert StringUtils.equals(s4, ExpressionExecution.compile(s4).symbol());
    }
}
