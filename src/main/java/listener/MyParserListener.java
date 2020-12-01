package listener;

import antlr.scratchBaseListener;
import antlr.scratchListener;
import antlr.scratchParser;
import listener.utils.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyParserListener extends scratchBaseListener {
    private final Map<String, Function> funcTable = new HashMap<>();
    private int funcOffset = 0;
    // 全局符号表
    //private final SymbolTable symbolTable = new SymbolTable(null, "#start");
    private String currentFunc = "#start";
    private int currentBlock = 0;
    private final Map<String, List<SymbolTable>> symMap = new HashMap<>();
    private boolean funcFlag;
    @Override
    public void enterProgram(scratchParser.ProgramContext ctx) {
        List<SymbolTable> tableList = new ArrayList<>();
        tableList.add(new SymbolTable(null, currentFunc));
        symMap.put(currentFunc, tableList);
    }

    @Override
    public void exitProgram(scratchParser.ProgramContext ctx) {
        for (String s : symMap.keySet()) {
            for (SymbolTable table : symMap.get(s)) {
                System.out.println(s + ": " + table);
            }
        }
    }

    @Override
    public void enterFunction(scratchParser.FunctionContext ctx) {
        String funcName = ctx.IDENT().getText();
        if (funcTable.get(funcName) != null) {
            throw new RuntimeException("函数重名");
        }
        currentFunc = funcName;

        Map<String, FunctionParam> paramMap = new HashMap<>();
        if (ctx.function_param_list() != null) {
            List<scratchParser.Function_paramContext> paramList = ctx.function_param_list().function_param();
            for (scratchParser.Function_paramContext param : paramList) {
                paramMap.put(param.IDENT().getText(), new FunctionParam(
                    param.isConst!=null, param.IDENT().getText(), Utils.getType(param.ty.getText())
                ));
            }
        }

        funcTable.put(funcName, new Function(
                funcName,
                paramMap,
                Utils.getType(ctx.ty.getText()),
                funcOffset++
        ));
        List<SymbolTable> tableList = new ArrayList<>();
        SymbolTable startTable = symMap.get("#start").get(symMap.get("#start").size() - 1);
        tableList.add(new SymbolTable(startTable, funcName));
        symMap.put(currentFunc, tableList);
        funcFlag = false;
    }

    @Override
    public void enterBlock_stmt(scratchParser.Block_stmtContext ctx) {
        if (!funcFlag) {
            funcFlag = true;
        } else{
            List<SymbolTable> tableList = symMap.get(currentFunc);
            SymbolTable table = new SymbolTable(tableList.get(tableList.size() - 1), currentFunc);
            tableList.add(table);
            currentBlock++;
        }

    }

    @Override
    public void exitBlock_stmt(scratchParser.Block_stmtContext ctx) {
        if (currentBlock > 0) currentBlock--;
    }

    @Override
    public void enterLet_decl_stmt(scratchParser.Let_decl_stmtContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        if (table.getCurTable(ident) != null) {
            throw new RuntimeException("duplicate-declareVar-error");
        }
        table.put(ident, new SymbolEntry(
               false,
               ctx.ASSIGN() != null,
                table.getOffset(),
                Utils.getType(ctx.ty.getText())
        ));
    }

    @Override
    public void enterConst_decl_stmt(scratchParser.Const_decl_stmtContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        if (table.getCurTable(ident) != null) {
            throw new RuntimeException("duplicate-declareConst-error");
        }
        table.put(ident, new SymbolEntry(
                true,
                true,
                table.getOffset(),
                Utils.getType(ctx.ty.getText())
        ));
    }

    @Override
    public void enterExpr(scratchParser.ExprContext ctx) {
        if (ctx.ari_expr() != null) {

        }
    }

    @Override
    public void enterAssign_expr(scratchParser.Assign_exprContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        ParamAndLocal paramOrLoc = (ParamAndLocal) getChainTable(ident);
        if (paramOrLoc.isConst()) {
            throw new RuntimeException("assign-const");
        }
    }

    @Override
    public void enterFactor(scratchParser.FactorContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        if (ctx.IDENT() != null) {
            String ident = ctx.IDENT().getText();
            //System.out.println(ident);
            if (table.getChainTable(ident) == null && !ident.equals("break") && !ident.equals("continue")
                    && funcTable.get(currentFunc).getParamMap().get(ident) == null) {
                throw new RuntimeException("undefined-var/const-error");
            }
        }

    }


    @Override
    public void enterReturn_stmt(scratchParser.Return_stmtContext ctx) {

    }

    private Object getChainTable(String ident) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        if (table.getChainTable(ident) == null && funcTable.get(currentFunc).getParamMap().get(ident) == null) {
            throw new RuntimeException("undefined-var/const-error");
        } else {
            if (table.getChainTable(ident) != null) return table.getChainTable(ident);
            else return funcTable.get(currentFunc).getParamMap().get(ident);
        }
    }
}
