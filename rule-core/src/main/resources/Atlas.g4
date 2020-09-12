grammar Atlas;
@header {
    package com.tencent.atlas.antlr;
}



// Simplified approach for expression
expressions
    : expression (',' expression)*
    ;

expression
    : notOperator=(NOT | '!') expression                            #notExpression
    | expression logicalOperator expression                         #logicalExpression
    | predicate IS NOT? testValue=(TRUE | FALSE)                    #isExpression
    | predicate                                                     #predicateExpression
    ;

predicate
    : predicate NOT? IN '(' expressions ')'                      #inPredicate
    | predicate IS nullNotnull                                   #isNullPredicate
    | left=predicate comparisonOperator right=predicate          #binaryComparasionPredicate
    | predicate NOT? LIKE predicate (ESCAPE STRING_LITERAL)?     #likePredicate
    | predicate NOT? regex=(REGEXP | RLIKE) predicate            #regexpPredicate
    | expressionAtom                                             #expressionAtomPredicate
    ;


// Add in ASTVisitor nullNotnull in constant
expressionAtom
    : constant                                                      #constantExpressionAtom
    | feature                                                       #featureExpressionAtom
    | attribute                                                     #attributeExpressionAtom
    | functionCall                                                  #functionCallExpressionAtom
    | unaryOperator expressionAtom                                  #unaryExpressionAtom
    | '(' expression (',' expression)* ')'                          #nestedExpressionAtom
    | left=expressionAtom bitOperator right=expressionAtom          #bitExpressionAtom
    | left=expressionAtom mathOperator right=expressionAtom         #mathExpressionAtom
    ;

functionCall
    : specificFunction                                              #specificFunctionCall
    | fullId '(' functionArgs? ')'                                  #udfFunctionCall
    | dataview '(' functionArgs? ')'                                #dataviewFunctionCall
    ;

specificFunction
    : (SUBSTR | SUBSTRING)
      '('
        (
          sourceString=stringLiteral
          | sourceExpression=expression
        ) FROM
        (
          fromDecimal=decimalLiteral
          | fromExpression=expression
        )
        (
          FOR
          (
            forDecimal=decimalLiteral
            | forExpression=expression
          )
        )?
      ')'                                                           #substrFunctionCall
    | CHAR_LENGTH
      '('
          sourceExpression=expression
      ')'                                                           #getLengthFunctionCall
    ;

functionArgs
    : functionArg
    (
      ','
      functionArg
    )*
    ;

functionArg
    : constant | feature | attribute | functionCall | expression
    ;

constant
    : stringLiteral | decimalLiteral | floatLiteral
    | '-' decimalLiteral
    | hexadecimalLiteral | booleanLiteral
    | NOT? nullLiteral=(NULL_LITERAL | NULL_SPEC_LITERAL)
    ;

stringLiteral
    : (
        STRING_LITERAL
      ) STRING_LITERAL+
    | STRING_LITERAL
    ;

booleanLiteral
    : TRUE | FALSE;

hexadecimalLiteral
    : HEXADECIMAL_LITERAL;

decimalLiteral
    : DECIMAL_LITERAL | ZERO_DECIMAL | ONE_DECIMAL | TWO_DECIMAL
    ;

floatLiteral
    : decimalLiteral DOT decimalLiteral
    ;

nullNotnull
    : NOT? (NULL_LITERAL | NULL_SPEC_LITERAL)
    ;

unaryOperator
    : '!' | '~' | '+' | '-' | NOT
    ;

comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '=' | '<' '=' '>'
    ;

logicalOperator
    : AND | '&' '&' | OR | '|' '|'
    ;

bitOperator
    : '<' '<' | '>' '>' | '&' | '^' | '|'
    ;

mathOperator
    : '*' | '/' | '%' | '+' | '-'
    ;
dataview
    : '@@' name=IDENTIFIER
    ;
feature
    : '**' name=IDENTIFIER
    ;
attribute
    : '$$' name=IDENTIFIER
    ;
fullId
    : name=IDENTIFIER
    ;


NULL_LITERAL:                        'NULL';
NULL_SPEC_LITERAL:                   '\\' 'N';
AND:                                 'AND'|'and';
OR:                                  'OR'|'or';
IS:                                  'IS'|'is';
NOT:                                 'NOT'|'not';
REGEXP:                              'REGEXP'|'regexp';
LIKE:                                'LIKE'|'like';
RLIKE:                               'RLIKE'|'rlike';
STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING;
DECIMAL_LITERAL:                     DEC_DIGIT+;
HEXADECIMAL_LITERAL:                 'X' '\'' (HEX_DIGIT HEX_DIGIT)+ '\''
                                     | '0X' HEX_DIGIT+;
IDENTIFIER:                          [A-Z0-9a-z_]+;
SUBSTR:                              'SUBSTR'|'substr';
SUBSTRING:                           'SUBSTRING'|'substring';
CHAR_LENGTH:                         'CHAR_LENGTH'|'char_length';
FROM:                                'FROM'|'from';
FOR:                                 'FOR'|'for';
ESCAPE:                              'ESCAPE'|'escape';
IN:                                  'IN';
TRUE:                                'TRUE'|'true';
FALSE:                               'FALSE'|'false';
ZERO_DECIMAL:                        '0';
ONE_DECIMAL:                         '1';
TWO_DECIMAL:                         '2';
DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
COMMA:                               ',';


fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:              '`' ( '\\'. | '``' | ~('`'|'\\'))* '`';
fragment HEX_DIGIT:                  [0-9A-F];
fragment DEC_DIGIT:                  [0-9];


// SKIP
SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);


