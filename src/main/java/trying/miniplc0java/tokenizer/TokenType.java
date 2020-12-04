package trying.miniplc0java.tokenizer;

public enum TokenType {
    /** fn */
    FN_KW,
    /** let */
    LET_KW ,
    /** const */
    CONST_KW,
    /** as */
    AS_KW,
    /** while */
    WHILE_KW,
    /** if */
    IF_KW,
    /** else */
    ELSE_KW,
    /** return */
    RETURN_KW,
    /** 无符号整数 */
    UINT_LITERAL,
    /** 字符串常量 */
    STRING_LITERAL,
    /** 字符常量 */
    CHAR_LITERAL,
    /** 浮点数常量 */
    DOUBLE_LITERAL,
    /** 标识符 */
    IDENT,
    /** + */
    PLUS,
    /** - */
    MINUS,
    /** 乘号 */
    MUL,
    /** div */
    DIV,
    /** = */
    ASSIGN,
    /** == */
    EQ,
    /** != */
    NEQ,
    /** < */
    LT,
    /** > */
    GT,
    /** <= */
    LE,
    /** >= */
    GE,
    /** ( */
    L_PAREN,
    /** ) */
    R_PAREN,
    /** { */
    L_BRACE,
    /** } */
    R_BRACE,
    /** -> */
    ARROW,
    /** , */
    COMMA,
    /** : */
    COLON,
    /** ; */
    SEMICOLON,

    VAR_KW,
    PRINT_KW,
    // extra
    /** // */
    COMMENT,
    BREAK_KW,
    CONTINUE_KW,
    INT_KW,
    DOUBLE_KW,
    VOID_KW,
    // Temp
    Begin,EOF,End,Ident,Uint,Plus,Minus,Mult,Div,Equal,Semicolon,LParen,RParen,Const,Var,Print


}
