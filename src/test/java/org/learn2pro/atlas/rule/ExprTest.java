package org.learn2pro.atlas.rule;

import org.learn2pro.atlas.model.Row;
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
   * char_length($$comment)>1 substr($$comment,1)
   */
  @Test
  public void testRule2() {
    Mockito.when(row.getByName(Mockito.eq("comment"))).thenReturn("abc应用宝");
    assert RuleExecution.exec("char_length($$comment)>1", row);
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
    Mockito.when(row.getByName(Mockito.eq("a"))).thenReturn(10);
    Mockito.when(row.getByName(Mockito.eq("b"))).thenReturn("false");
    Mockito.when(row.getByName(Mockito.eq("openid"))).thenReturn("abcdefgh121");
    assert !RuleExecution.exec("$$a > 15 and $$openid='' and $$b!='true'", row);
  }

  /**
   * $$nick_name like '%求回关%' and $$register < 7 and char_length($$nick) > 10 and $$c > 2 and
   * $$certificate!='cert'
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

}
