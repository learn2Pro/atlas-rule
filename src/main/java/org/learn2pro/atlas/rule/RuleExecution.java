package org.learn2pro.atlas.rule;

import com.google.common.base.Preconditions;
import org.learn2pro.atlas.antlr.AtlasLexer;
import org.learn2pro.atlas.antlr.AtlasParser;
import org.learn2pro.atlas.antlr.AtlasRuleVisitor;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.expr.Predicate;
import org.learn2pro.atlas.model.Row;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * rule execution runtime
 */
public class RuleExecution {

  public static final Logger LOGGER = LoggerFactory.getLogger(RuleExecution.class);
  /**
   * visitor
   */
  private static AtlasRuleVisitor VISITOR = new AtlasRuleVisitor();

  /**
   * rule symbol to compile
   * <p> **a > 10 <p/>
   * <p> **a > 10 and **b < 5 <p/>
   * <p> **b like '%abc%' <p/>
   *
   * @param rule the rule text
   * @return return compiled predicate
   */
  public static Predicate compile(String rule) {
    CharStream stream = CharStreams.fromString(rule);
    AtlasLexer lexer = new AtlasLexer(stream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AtlasParser parser = new AtlasParser(tokens);
    ExpressionGroup group = (ExpressionGroup) VISITOR.visit(parser.expressions());
    Preconditions.checkArgument(group.size() == 1 && group.first() instanceof Predicate,
        "only support predicate expression,pls check!");
    return (Predicate) group.first();
  }

  /**
   * validate the rule text?
   *
   * @param rule the rule text
   * @return validate or not
   */
  public static boolean validate(String rule) {
    try {
      compile(rule);
      return true;
    } catch (Exception e) {
      LOGGER.error("rule `{}` is not valid!", rule);
      return false;
    }
  }

  /**
   * execute the user-defined rule with input
   *
   * @param rule  the rule text
   * @param input the input params
   * @return pass or not
   */
  public static boolean exec(String rule, Row input) {
    return compile(rule).eval(input);
  }

}
