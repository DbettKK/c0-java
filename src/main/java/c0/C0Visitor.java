// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\C0.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package c0;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link C0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface C0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(C0Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#functionParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParamList(C0Parser.FunctionParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#functionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParam(C0Parser.FunctionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(C0Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(C0Parser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#declStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStmt(C0Parser.DeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#letDeclStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDeclStmt(C0Parser.LetDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#constDeclStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclStmt(C0Parser.ConstDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(C0Parser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(C0Parser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(C0Parser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(C0Parser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(C0Parser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(C0Parser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(C0Parser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(C0Parser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(C0Parser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(C0Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(C0Parser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcLabelExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncLabelExpr(C0Parser.FuncLabelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(C0Parser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nagExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNagExpr(C0Parser.NagExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uint}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUint(C0Parser.UintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(C0Parser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpr(C0Parser.AsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(C0Parser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(C0Parser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(C0Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(C0Parser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(C0Parser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetInt(C0Parser.GetIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDouble(C0Parser.GetDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetChar(C0Parser.GetCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putInt}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutInt(C0Parser.PutIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putDouble}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutDouble(C0Parser.PutDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putChar}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutChar(C0Parser.PutCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putStr}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStr(C0Parser.PutStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putLn}
	 * labeled alternative in {@link C0Parser#callStdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutLn(C0Parser.PutLnContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(C0Parser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(C0Parser.CharacterContext ctx);
}