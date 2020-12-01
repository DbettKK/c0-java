// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\scratch.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scratchParser}.
 */
public interface scratchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(scratchParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(scratchParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(scratchParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(scratchParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param_list(scratchParser.Function_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param_list(scratchParser.Function_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(scratchParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(scratchParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(scratchParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(scratchParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(scratchParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(scratchParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmt(scratchParser.Decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmt(scratchParser.Decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#let_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLet_decl_stmt(scratchParser.Let_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#let_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLet_decl_stmt(scratchParser.Let_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#const_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl_stmt(scratchParser.Const_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#const_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl_stmt(scratchParser.Const_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(scratchParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(scratchParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(scratchParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(scratchParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(scratchParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(scratchParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#empty_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_stmt(scratchParser.Empty_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#empty_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_stmt(scratchParser.Empty_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(scratchParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(scratchParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(scratchParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(scratchParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#as_expr}.
	 * @param ctx the parse tree
	 */
	void enterAs_expr(scratchParser.As_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#as_expr}.
	 * @param ctx the parse tree
	 */
	void exitAs_expr(scratchParser.As_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(scratchParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(scratchParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#ari_expr}.
	 * @param ctx the parse tree
	 */
	void enterAri_expr(scratchParser.Ari_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#ari_expr}.
	 * @param ctx the parse tree
	 */
	void exitAri_expr(scratchParser.Ari_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(scratchParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(scratchParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(scratchParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(scratchParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#call_func}.
	 * @param ctx the parse tree
	 */
	void enterCall_func(scratchParser.Call_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#call_func}.
	 * @param ctx the parse tree
	 */
	void exitCall_func(scratchParser.Call_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#call_stdlib}.
	 * @param ctx the parse tree
	 */
	void enterCall_stdlib(scratchParser.Call_stdlibContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#call_stdlib}.
	 * @param ctx the parse tree
	 */
	void exitCall_stdlib(scratchParser.Call_stdlibContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(scratchParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(scratchParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(scratchParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(scratchParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(scratchParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(scratchParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(scratchParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(scratchParser.FactorContext ctx);
}