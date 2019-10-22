package com.bytecodeassemblers.androidcalculator;

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

    public void walkoperatorVar() {
        final String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";
        String[] calculationSteps = this.operatorVar.split(String.format(WITH_DELIMITER, "[+-]"));
        for(int i=0; i<calculationSteps.length; i++) {
            switch(calculationSteps[i]) {
                case "+":
                    numberVar += Double.parseDouble(calculationSteps[++i]);
                    break;
                case "-":
                    numberVar -= Double.parseDouble(calculationSteps[++i]);
                    break;
                default:
                    numberVar = Double.parseDouble(calculationSteps[i]);
                    break;
            }
        }
        System.out.println(numberVar);
    }
}