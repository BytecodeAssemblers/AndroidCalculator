package com.bytecodeassemblers.androidcalculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Operators {
    private double numberVar = 0;
    private String operatorVar = "";

    public double getNumberVar() {
        return numberVar;
    }

    public void setNumberVar(double numberVar) {
        this.numberVar = numberVar;
    }

    public String getOperatorVar() {
        return operatorVar;
    }

    public void setOperatorVar(String operatorVar) {
        this.operatorVar = operatorVar;
    }

    public void subtractOperatorVar() {
        if(this.operatorVar.length() > 1)
            this.operatorVar = operatorVar.substring(0, operatorVar.length() - 1);
        else
            this.operatorVar = "0";
    }

    public void appendOperatorVar(String operatorVar) {
        this.operatorVar += operatorVar;
    }

    public void simpleEvaluate() {
        Expression expresion = new ExpressionBuilder(operatorVar).build();
        numberVar = expresion.evaluate();
    }
}