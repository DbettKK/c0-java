// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\scratch.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scratchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scratchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scratchParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(scratchParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(scratchParser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#function_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param_list(scratchParser.Function_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(scratchParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(scratchParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(scratchParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(scratchParser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#let_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_decl_stmt(scratchParser.Let_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#const_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl_stmt(scratchParser.Const_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(scratchParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(scratchParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(scratchParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#empty_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_stmt(scratchParser.Empty_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(scratchParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(scratchParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(scratchParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#ari_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAri_expr(scratchParser.Ari_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(scratchParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(scratchParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#call_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_func(scratchParser.Call_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#call_stdlib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stdlib(scratchParser.Call_stdlibContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(scratchParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(scratchParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(scratchParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(scratchParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(scratchParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link scratchParser#nag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNag(scratchParser.NagContext ctx);
}