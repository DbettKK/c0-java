// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\C0.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package c0;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C0Parser}.
 */
public interface C0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(C0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(C0Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(C0Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#functionParamList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParamList(C0Parser.FunctionParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#functionParamList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParamList(C0Parser.FunctionParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#functionParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParam(C0Parser.FunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#functionParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParam(C0Parser.FunctionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(C0Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(C0Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(C0Parser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(C0Parser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#declStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclStmt(C0Parser.DeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#declStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclStmt(C0Parser.DeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#letDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetDeclStmt(C0Parser.LetDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#letDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetDeclStmt(C0Parser.LetDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#constDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclStmt(C0Parser.ConstDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#constDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclStmt(C0Parser.ConstDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(C0Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(C0Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(C0Parser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(C0Parser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(C0Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(C0Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(C0Parser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(C0Parser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(C0Parser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(C0Parser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(C0Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(C0Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(C0Parser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(C0Parser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(C0Parser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(C0Parser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(C0Parser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(C0Parser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ident}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdent(C0Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdent(C0Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(C0Parser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(C0Parser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcLabelExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncLabelExpr(C0Parser.FuncLabelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcLabelExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncLabelExpr(C0Parser.FuncLabelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(C0Parser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(C0Parser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nagExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNagExpr(C0Parser.NagExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nagExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNagExpr(C0Parser.NagExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uint}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUint(C0Parser.UintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uint}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUint(C0Parser.UintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(C0Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(C0Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAsExpr(C0Parser.AsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAsExpr(C0Parser.AsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(C0Parser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(C0Parser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(C0Parser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(C0Parser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(C0Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(C0Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(C0Parser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(C0Parser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(C0Parser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(C0Parser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterGetInt(C0Parser.GetIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitGetInt(C0Parser.GetIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterGetDouble(C0Parser.GetDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitGetDouble(C0Parser.GetDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterGetChar(C0Parser.GetCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitGetChar(C0Parser.GetCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterPutInt(C0Parser.PutIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitPutInt(C0Parser.PutIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterPutDouble(C0Parser.PutDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitPutDouble(C0Parser.PutDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterPutChar(C0Parser.PutCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitPutChar(C0Parser.PutCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putStr}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterPutStr(C0Parser.PutStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putStr}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitPutStr(C0Parser.PutStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putLn}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void enterPutLn(C0Parser.PutLnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putLn}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 */
	void exitPutLn(C0Parser.PutLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(C0Parser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(C0Parser.StrContext ctx);
}