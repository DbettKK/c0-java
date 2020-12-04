grammar C0;    //定义规则文件grammar
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
    package c0;
}
//parsers
@rulecatch {
    catch (RecognitionException e) {
        throw e;
    }
}

program: (declStmt | function)*;

function: 'fn' IDENT '(' functionParamList? ')' '->' ty=('int'|'void'|'double') blockStmt;
    functionParamList: functionParam (',' functionParam)*;
    functionParam: isConst='const'? IDENT ':' ty=('int' | 'double');

stmt: exprStmt
    | declStmt
    | ifStmt
    | whileStmt
    | returnStmt
    | blockStmt
    | emptyStmt
    | breakStmt
    | continueStmt
    ;

exprStmt: expr ';';
declStmt: letDeclStmt | constDeclStmt;
    letDeclStmt: 'let' IDENT ':' ty=('int' | 'double') ('=' expr)? ';';
    constDeclStmt: 'const' IDENT ':' ty=('int' | 'double') '=' expr ';';
ifStmt: 'if' '('? expr ')'? blockStmt elseStmt?;
elseStmt: 'else' (blockStmt | ifStmt);
whileStmt: 'while' '('? expr ')'? blockStmt;
blockStmt: '{' stmt* '}';
emptyStmt: ';';
returnStmt: 'return' expr? ';';
breakStmt: 'break' ';';
continueStmt: 'continue' ';';
expr: funcExpr                              # funcLabelExpr
    | ('-')+ expr                           # nagExpr
    | expr 'as' ty=('int' | 'double')       # asExpr
    | expr op=('*' | '/') expr              # multExpr
    | expr op=('+' | '-') expr              # addExpr
    | '(' expr ')'                          # parenExpr
    | expr BOOL_OP expr                     # boolExpr
    | IDENT ASSIGN expr                     # assignExpr
    | IDENT                                 # ident
    | UINT                                  # uint
    | DOUBLE                                # double
    | Char                                  # char
    ;


funcExpr: callFunc | callStdlib;
    callFunc: IDENT '(' (expr (',' expr)*)? ')';
        //param: expr (',' expr)*;
    callStdlib: GETINT '(' ')'                          # getInt
        | GETDOUBLE '(' ')'                             # getDouble
        | GETCHAR '(' ')'                               # getChar
        | PUTINT '(' (expr) ')'                         # putInt
        | PUTDOUBLE '(' (expr) ')'                      # putDouble
        | PUTCHAR '(' (Char | UINT | expr) ')'   # putChar
        | PUTSTR '(' (str) ')'                          # putStr
        | PUTLN '(' ')'                                 # putLn
        ;

    /*sTRING_LITERAL: '"' (string_regular_char | escape_sequence)* '"';
    string_regular_char: ~('"');
    escape_sequence: '\n' | '|' | '\r' | '\t' | '\\';
    //str: '"' character* '"' | NO_COMMET;*/
    str: String;
    //character: cl=~('"' | '\\') | EscapeSequence  | '|' | '#' | '^' | '?';

// lexer
//NO_COMMET: '"' (. | '\\"' | '//' | '\n' | '|' | '\r' | '\t' | '\\')*? '"';
String: '"' ('\\"'| ' ' | '\\n' | '|' | '\\r' | '\\t' | '\\\\' | .)*? '"';
Char: '\''  ('\\\''| ' ' | '\\n' | '|' | '\\r' | '\\t' | '\\\\' | .) '\'';
EscapeSequence: '\\n' | '\\r' | '\\t' | '\\\\' | '\\"' | '\\\'' | '!';
BOOL_OP: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
ASSIGN: '=';
GETINT: 'getint';
GETDOUBLE : 'getdouble';
GETCHAR: 'getchar';
PUTINT: 'putint';
PUTDOUBLE: 'putdouble';
PUTCHAR: 'putchar';
PUTSTR: 'putstr';
PUTLN: 'putln';

UINT: [0-9]+;
//CharLiteral: '\'' (EscapeSequence | ~('\\' | '\'') | '|' | '#' | '^' | '?')? '\'';
DOUBLE: [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;
IDENT : ([_a-zA-Z] [_a-zA-Z0-9]*);// match lower-case identifiers


//NO_SPACE: '"' .*? [ \t\r]+ .*? '"';

SL_COMMENT: '//' .*? '\n' -> skip;
WS : [ \t\r\n]+ -> skip ;// skip spaces, tabs, newlines, \r(Windows)




