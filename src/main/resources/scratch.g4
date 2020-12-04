grammar scratch;    //定义规则文件grammar
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
    package antlr;
}
//parsers
@rulecatch {
    catch (RecognitionException e) {
        throw e;
    }
}

program: (decl_stmt | function)*;
//gloabal_decl_stmt: decl_stmt;
function_param: isConst='const'? IDENT ':' ty=('int' | 'double');
function_param_list: function_param (',' function_param)*;
function: 'fn' IDENT '(' function_param_list? ')' '->' ty=('int'|'void'|'double') block_stmt;

stmt:
      expr_stmt
    | decl_stmt
    | if_stmt
    | while_stmt
    | return_stmt
    | block_stmt
    | empty_stmt
    ;

expr_stmt: expr ';';


decl_stmt: let_decl_stmt | const_decl_stmt;
let_decl_stmt: 'let' IDENT ':' ty=('int' | 'double') ('=' expr)? ';';
const_decl_stmt: 'const' IDENT ':' ty=('int' | 'double') '=' expr ';';

if_stmt: 'if' '('? expr ')'? block_stmt ('else' (block_stmt | if_stmt))?;

while_stmt: 'while' '('? expr ')'? block_stmt;

block_stmt: '{' stmt* '}';

empty_stmt: ';';

return_stmt: 'return' expr? ';';

expr: func_expr | ari_expr | assign_expr | bool_expr;
    //(ari_expr | func_expr) (BOOL_OP (ari_expr | func_expr))* | assign_expr;
bool_expr: (ari_expr | func_expr) BOOL_OP (ari_expr | func_expr);
ari_expr: item ((add='+'|minus='-') item)*;
assign_expr: IDENT ASSIGN expr;
func_expr: call_func | call_stdlib;

call_func: IDENT '(' (param)? ')';
call_stdlib: GETINT '(' ')'
    | GETDOUBLE '(' ')'
    | GETCHAR '(' ')'
    | PUTINT '(' (expr) ')'
    | PUTDOUBLE '(' (expr) ')'
    | PUTCHAR '(' (Char_literal | UINT | expr) ')'
    //| PUTCHAR '(' (expr) ')'
    | PUTSTR '(' (str) ')'
    | PUTLN '(' ')'
    ;

str: '"' character* '"' | NO_COMMET;
character: Escape_sequence | cl=~('"' | '\\') | '|' | '#' | '^' | '?';

param: expr (',' expr)*;

item: factor ((mult='*'|div='/') factor)*;
// 因子 -> 符号? (标识符 | 无符号整数 | '(' 表达式 ')') |
factor: nag (IDENT | UINT | DOUBLE | '(' expr ')' | func_expr) (as='as' ty=('int' | 'double'))+
      | nag (IDENT | UINT | DOUBLE | '(' expr ')' | func_expr);
nag: ('-')*;
Escape_sequence: '\\n' | '\\r' | '\\t' | '\\\\' | '\\"' | '\\\'' | '!';
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

UINT: [0-9]+ | Char_literal;
Char_literal: '\'' (Escape_sequence | ~('\\' | '\''))? '\'';
DOUBLE: [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;
IDENT : ([_a-zA-Z] [_a-zA-Z0-9]*);// match lower-case identifiers

NO_COMMET: '"' .*? '//' .*? '"';
SL_COMMENT: '//' .*? '\n' -> skip;
WS : [ \t\r\n]+ -> skip ;// skip spaces, tabs, newlines, \r(Windows)




