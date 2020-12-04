package trying.miniplc0java.analyser;

import trying.miniplc0java.error.*;
import trying.miniplc0java.function.Function;
import trying.miniplc0java.function.FunctionParam;
import trying.miniplc0java.instruction.Instruction;
import trying.miniplc0java.instruction.Operation;
import trying.miniplc0java.symbol.SymbolTable;
import trying.miniplc0java.tokenizer.Token;
import trying.miniplc0java.tokenizer.TokenType;
import trying.miniplc0java.tokenizer.Tokenizer;
import trying.miniplc0java.util.Pos;
import trying.miniplc0java.util.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * | 全局符号表 两个 变量 & 函数
 *     | 每个函数分别建立自己的符号表
 *         | 如果存在块语句 再建立符号表
 */
public final class Analyser {

    Tokenizer tokenizer;
    ArrayList<Instruction> instructions;

    /** 当前偷看的 token */
    Token peekedToken = null;

    /** 符号表 */
    //HashMap<String, SymbolEntry> symbolTable = new HashMap<>();
    SymbolTable symbolTable = new SymbolTable(null);

    /* 函数表 **/
    Map<String, Function> funcTable = new HashMap<>();
    int funcOffset = 0;

    /** 下一个变量的栈偏移 */
    int nextOffset = 0;

    public Analyser(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
        this.instructions = new ArrayList<>();
    }

    public List<Instruction> analyse() throws CompileError {
        analyseProgram();
        return instructions;
    }

    /**
     * 查看下一个 Token
     * 
     * @return
     * @throws TokenizeError
     */
    private Token peek() throws TokenizeError {
        if (peekedToken == null) {
            peekedToken = tokenizer.nextToken();
        }
        return peekedToken;
    }

    /**
     * 获取下一个 Token
     * 
     * @return
     * @throws TokenizeError
     */
    private Token next() throws TokenizeError {
        if (peekedToken != null) {
            var token = peekedToken;
            peekedToken = null;
            return token;
        } else {
            return tokenizer.nextToken();
        }
    }

    /**
     * 如果下一个 token 的类型是 tt，则返回 true
     * 
     * @param tt
     * @return
     * @throws TokenizeError
     */
    private boolean check(TokenType tt) throws TokenizeError {
        var token = peek();
        return token.getTokenType() == tt;
    }

    /**
     * 如果下一个 token 的类型是 tt，则前进一个 token 并返回这个 token
     * 
     * @param tt 类型
     * @return 如果匹配则返回这个 token，否则返回 null
     * @throws TokenizeError
     */
    private Token nextIf(TokenType tt) throws TokenizeError {
        var token = peek();
        if (token.getTokenType() == tt) {
            return next();
        } else {
            return null;
        }
    }

    /**
     * 如果下一个 token 的类型是 tt，则前进一个 token 并返回，否则抛出异常
     * 
     * @param tt 类型
     * @return 这个 token
     * @throws CompileError 如果类型不匹配
     */
    private Token expect(TokenType tt) throws CompileError {
        var token = peek();
        if (token.getTokenType() == tt) {
            return next();
        } else {
            throw new ExpectedTokenError(tt, token);
        }
    }

    /**
     * 设置符号为已赋值
     * 
     * @param name   符号名称
     * @param curPos 当前位置（报错用）
     * @throws AnalyzeError 如果未定义则抛异常
     */
    private void initializeSymbol(Token name, Pos curPos) throws AnalyzeError {
        var entry = this.symbolTable.get(name.getValueString());
        if (entry == null) {
            throw new AnalyzeError(ErrorCode.NotDeclared, curPos);
        } else {
            entry.setInitialized(true);
        }
    }

    /**
     * 获取变量在栈上的偏移
     * 
     * @param name   符号名
     * @param curPos 当前位置（报错用）
     * @return 栈偏移
     * @throws AnalyzeError
     */
    private int getOffset(Token name, Pos curPos) throws AnalyzeError {
        var entry = this.symbolTable.get(name.getValueString());
        if (entry == null) {
            throw new AnalyzeError(ErrorCode.NotDeclared, curPos);
        } else {
            return entry.getStackOffset();
        }
    }


    /**
     * 获取变量是否是常量
     * 
     * @param name   符号名
     * @param curPos 当前位置（报错用）
     * @return 是否为常量
     * @throws AnalyzeError
     */
    private boolean isConstant(String name, Pos curPos) throws AnalyzeError {
        var entry = this.symbolTable.get(name);
        if (entry == null) {
            throw new AnalyzeError(ErrorCode.NotDeclared, curPos);
        } else {
            return entry.isConstant();
        }
    }

    private void analyseProgram() throws CompileError {
        do {
            TokenType tmp = peek().getTokenType();
            if (tmp == TokenType.FN_KW) {
                analyseFunction();
            } else if (tmp == TokenType.LET_KW) {
                analyseVariableDeclaration(symbolTable);
            } else if (tmp == TokenType.CONST_KW) {
                analyseConstantDeclaration(symbolTable);
            }
        } while (nextIf(TokenType.EOF) == null);

        //analyseMain();
        //expect(TokenType.EOF);
    }

    private void analyseMain() throws CompileError {
        // 主过程 -> 常量声明 变量声明 语句序列
        //analyseConstantDeclaration();
        //analyseVariableDeclaration();
        analyseStatementSequence();
    }

    private void analyseFunction() throws CompileError {
        expect(TokenType.FN_KW);
        Map<String, FunctionParam> paramMap = new HashMap<>();

        String functionName = expect(TokenType.IDENT).getValueString();
        // 查表
        if (this.funcTable.get(functionName) != null) {
            throw new AnalyzeError(ErrorCode.DuplicateDeclaration, peek().getStartPos());
        }

        expect(TokenType.L_PAREN);
        if (nextIf(TokenType.R_PAREN) == null) {
            analyseFunctionParam(paramMap);
            while (nextIf(TokenType.COMMA) != null) {
                analyseFunctionParam(paramMap);
            }
            next(); // ')'
        }
        expect(TokenType.ARROW);
        Type returnType = checkType(next().getValueString()); // int | void | double
        // 填表
        funcTable.put(functionName, new Function(functionName, paramMap, returnType, funcOffset++));
        SymbolTable newTable = new SymbolTable(symbolTable);
        for (String s : paramMap.keySet()) {
            //isConstant, boolean isInitialized, int stackOffset, Type type, Object value
            FunctionParam param = paramMap.get(s);
            // 函数参数 初始值先为0
            newTable.put(s, new SymbolEntry(param.isConst(), true, 0, param.getParamType(), 0));
        }
        analyseBlockStatement(newTable);
    }

    private void analyseFunctionParam(Map<String, FunctionParam> paramMap) throws CompileError {
        boolean isConst = false;
        if (nextIf(TokenType.CONST_KW) != null) {
            isConst = true;
        }
        String param = expect(TokenType.IDENT).getValueString();
        if (paramMap.get(param) != null) {
            // 已经有了这个名的参数
            throw new AnalyzeError(ErrorCode.InvalidFunctionParamDeclaration, peek().getStartPos());
        }
        System.out.println(param);
        expect(TokenType.COLON);
        TokenType peekedType = peek().getTokenType();
        if (peekedType != TokenType.INT_KW && peekedType != TokenType.DOUBLE_KW) {
            throw new AnalyzeError(ErrorCode.InvalidFunctionParamDeclaration, peek().getStartPos());
        }
        Type paramType = checkType(next().getValueString());  // int | double
        paramMap.put(param, new FunctionParam(isConst, param, paramType));
    }

    private void analyseBlockStatement(SymbolTable symbolTable) throws CompileError {
        expect(TokenType.L_BRACE);
        analyseStatementSequence();
        expect(TokenType.R_BRACE);
    }

    private void analyseConstantDeclaration(SymbolTable symbolTable) throws CompileError {
        // 将该常量存入符号表 且存类型和值
        expect(TokenType.CONST_KW);
        Token ident = expect(TokenType.IDENT);
        if (symbolTable.check(ident.getValueString())) {
            throw new AnalyzeError(ErrorCode.DuplicateDeclaration, peek().getStartPos());
        }
        expect(TokenType.COLON);
        Type type = checkType(peek().getValueString());
        next();
        expect(TokenType.ASSIGN);
        Object value = analyseExpression();
        expect(TokenType.SEMICOLON);
        symbolTable.put(ident.getValueString(),
                new SymbolEntry(true, true, symbolTable.getOffset(), type, value));
    }

    private void analyseVariableDeclaration(SymbolTable symbolTable) throws CompileError {
        boolean initialized = false;
        expect(TokenType.LET_KW);
        Token ident = expect(TokenType.IDENT);
        if (symbolTable.check(ident.getValueString())) {
            throw new AnalyzeError(ErrorCode.DuplicateDeclaration, peek().getStartPos());
        }
        expect(TokenType.COLON);
        Type type = checkType(peek().getValueString());
        next();
        Object value = 0;   // 初始值为 0
        if (peek().getTokenType() == TokenType.ASSIGN) {
            next();
            initialized = true;
            value = analyseExpression();
        }
        expect(TokenType.SEMICOLON);

        symbolTable.put(ident.getValueString(),
                new SymbolEntry(false, initialized, symbolTable.getOffset(), type, value));
        // 如果没有初始化的话在栈里推入一个初始值
        /*if (!initialized) {
            instructions.add(new Instruction(Operation.LIT, 0));
        }*/
    }

    private void analyseStatementSequence() throws CompileError {
        // 语句序列 -> 语句*
        //stmt -> expr_stmt | decl_stmt | if_stmt | while_stmt | return_stmt | block_stmt | empty_stmt
        // expr_stmt -> expr ';'
        // decl_stmt -> let_decl_stmt | const_decl_stmt
        // if_stmt -> 'if' expr block_stmt ('else' (block_stmt | if_stmt))?
        // while_stmt -> 'while' expr block_stmt
        // return_stmt -> 'return' expr? ';'
        // block_stmt -> '{' stmt* '}'
        // empty_stmt -> ';'
        while (true) {
            // 如果下一个 token 是……
            Token peeked = peek();
            if (peeked.getTokenType() == TokenType.IF_KW) {
                analyseIfStatement();
            } else if (peeked.getTokenType() == TokenType.WHILE_KW) {
                analyseWhileStatement();
            } else if (peeked.getTokenType() == TokenType.RETURN_KW) {

            }
            if (peeked.getTokenType() == TokenType.IDENT) {
                analyseAssignmentStatement();
                // 调用相应的分析函数
                // 如果遇到其他非终结符的 FIRST 集呢？
            } else if (peeked.getTokenType() == TokenType.PRINT_KW) {
                analyseOutputStatement();
            } else {
                // 都不是，摸了
                break;
            }
        }
        //throw new Error("Not implemented");
    }

    private int analyseConstantExpression() throws CompileError {
        // 常表达式 -> 符号? 无符号整数
        boolean negative = false;
        if (nextIf(TokenType.PLUS) != null) {
            negative = false;
        } else if (nextIf(TokenType.MINUS) != null) {
            negative = true;
        }

        Token token = expect(TokenType.UINT_LITERAL);

        int value = (int) token.getValue();
        if (negative) {
            value = -value;
        }

        return value;
    }

    private void analyseAllExpression() throws CompileError {
        analyseExpression();
        if (peek().getTokenType() == TokenType.EQ || peek().getTokenType() == TokenType.NEQ ||
                peek().getTokenType() == TokenType.LT || peek().getTokenType() == TokenType.GT ||
                peek().getTokenType() == TokenType.LE || peek().getTokenType() == TokenType.GE) {
            next();
            analyseExpression();
        }

    }

    private Object analyseExpression() throws CompileError {
        // expr ->
        //      operator_expr -> expr binary_operator expr
        //    | negate_expr -> '-' expr
        //    | assign_expr -> l_expr '=' expr
        //    | as_expr -> expr 'as' ty
        //    | call_expr -> IDENT '(' call_param_list? ')'
        //    | literal_expr -> UINT_LITERAL | DOUBLE_LITERAL | STRING_LITERAL
        //    | ident_expr -> IDENT
        //    | group_expr -> '(' expr ')'
        // 条件表达式 -> 表达式 逻辑 表达式
        // 表达式 -> 项 (加法运算符 项)*
        // 项
        analyseItem();

        while (true) {
            // 预读可能是运算符的 token
            Token op = peek();
            if (op.getTokenType() != TokenType.PLUS && op.getTokenType() != TokenType.MINUS) {
                break;
            }

            // 运算符
            next();

            // 项
            analyseItem();

            // 生成代码
            if (op.getTokenType() == TokenType.PLUS) {
                instructions.add(new Instruction(Operation.ADD));
            } else if (op.getTokenType() == TokenType.MINUS) {
                instructions.add(new Instruction(Operation.SUB));
            }
        }
        return 0;
    }
    private void analyseIfStatement() throws CompileError {
        // if_stmt -> 'if' expr block_stmt ('else' (block_stmt | if_stmt))?
        expect(TokenType.IF_KW);
        boolean condition = analyseIfExpression();
        if (condition) {
            analyseBlockStatement(null);
            // TODO 跳过
        } else {
            // TODO 跳过操作
            Token peeked = peek();
            if (peeked.getTokenType() == TokenType.ELSE_KW) {
                next();
                if (peek().getTokenType() == TokenType.IF_KW) {
                    analyseIfStatement();
                } else if (peek().getTokenType() == TokenType.L_BRACE) {
                    analyseBlockStatement(null);
                } else {
                    throw new AnalyzeError(ErrorCode.InvalidElseStatement, peek().getStartPos());
                }
            }
        }
    }

    private void analyseWhileStatement() throws CompileError{
        // while_stmt -> 'while' expr block_stmt
        expect(TokenType.WHILE_KW);
        while (analyseIfExpression()) {
            analyseBlockStatement(null);
        }
    }

    private void analyseAssignmentStatement() throws CompileError {
        // 赋值语句 -> 标识符 '=' 表达式 ';'

        // 分析这个语句

        // 标识符是什么？
        Token name = peek();
        SymbolEntry symbol = symbolTable.get(name.getValueString());
        if (symbol == null) {
            // 没有这个标识符
            throw new AnalyzeError(ErrorCode.NotDeclared, /* 当前位置 */ peek().getStartPos());
        } else if (symbol.isConstant()) {
            // 标识符是常量
            throw new AnalyzeError(ErrorCode.AssignToConstant, /* 当前位置 */ peek().getStartPos());
        }
        // 设置符号已初始化
        next();
        initializeSymbol(name, name.getStartPos());

        // 把结果保存
        int offset = getOffset(name, name.getStartPos());
        instructions.add(new Instruction(Operation.STO, offset));

        expect(TokenType.ASSIGN);
        analyseExpression();
        expect(TokenType.SEMICOLON);
    }

    private void analyseOutputStatement() throws CompileError {
        // 输出语句 -> 'print' '(' 表达式 ')' ';'

        expect(TokenType.PRINT_KW);
        expect(TokenType.L_PAREN);

        analyseExpression();

        expect(TokenType.R_PAREN);
        expect(TokenType.SEMICOLON);

        instructions.add(new Instruction(Operation.WRT));
    }

    private boolean analyseIfExpression() throws CompileError {
        return true;
    }

    private void analyseItem() throws CompileError {
        // 项 -> 因子 (乘法运算符 因子)*

        // 因子
        analyseFactor();

        while (true) {
            // 预读可能是运算符的 token
            Token op = peek();
            if (op.getTokenType() != TokenType.MUL && op.getTokenType() != TokenType.DIV) {
                break;
            }

            // 运算符
            next();

            // 因子
            analyseFactor();

            // 生成代码
            if (op.getTokenType() == TokenType.MUL) {
                instructions.add(new Instruction(Operation.MUL));
            } else if (op.getTokenType() == TokenType.DIV) {
                instructions.add(new Instruction(Operation.DIV));
            }
        }
    }

    private void analyseFactor() throws CompileError {
        // 因子 -> 符号? (标识符 | 无符号整数 | '(' 表达式 ')') | 函数表达式

        boolean negate;
        if (nextIf(TokenType.MINUS) != null) {
            negate = true;
            // 计算结果需要被 0 减
            instructions.add(new Instruction(Operation.LIT, 0));
        } else {
            nextIf(TokenType.PLUS);
            negate = false;
        }

        if (check(TokenType.IDENT)) {
            // 是标识符

            // 加载标识符的值
            Token name = peek();
            next();
            // TODO 函数调用
            SymbolEntry symbol = symbolTable.get(name.getValueString());
            if (symbol == null) {
                // 没有这个标识符
                throw new AnalyzeError(ErrorCode.NotDeclared, peek().getStartPos());
            } else if (!symbol.isInitialized()) {
                // 标识符没初始化
                // TODO
                throw new AnalyzeError(ErrorCode.NotInitialized, /* 当前位置 */ peek().getStartPos());
            }
            int offset = getOffset(name, peek().getStartPos());
            instructions.add(new Instruction(Operation.LOD, offset));
        } else if (check(TokenType.UINT_LITERAL)) {
            // 是整数
            // 加载整数值
            int value = (int) peek().getValue();
            next();
            instructions.add(new Instruction(Operation.LIT, value));
        } else if (check(TokenType.L_PAREN)) {
            // 是表达式
            // 调用相应的处理函数
            analyseExpression();
        } else {
            // 都不是，摸了
            throw new ExpectedTokenError(List.of(TokenType.IDENT, TokenType.UINT_LITERAL,
                    TokenType.L_PAREN), next());
        }

        if (negate) {
            instructions.add(new Instruction(Operation.SUB));
        }
        //throw new Error("Not implemented");
    }

    private Type checkType(String type) throws TokenizeError, AnalyzeError {
        if (type.charAt(0) == 'I') {
            return Type.INT;
        } else if (type.charAt(0) == 'D') {
            return Type.DOUBLE;
        } else if (type.charAt(0) == 'V') {
            return Type.DOUBLE;
        }
        throw new AnalyzeError(ErrorCode.InvalidType, peek().getStartPos());
    }
}
