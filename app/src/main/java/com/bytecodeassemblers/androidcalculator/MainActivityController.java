package com.bytecodeassemblers.androidcalculator;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityController {
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonZero;
    private Button buttonDot;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMul;
    private Button buttonDiv;
    private Button buttonEqual;
    private Button buttonPercentage;
    private Button buttonClearEverything;
    private Button buttonBackSpace;
    private TextView calculatorDisplay;
    private Operators operatorsModel;
    private Activity mainActivity;

    MainActivityController(Activity mainAct) {
        this.operatorsModel = new Operators();
        this.mainActivity = mainAct;
        initializeComponents();
        updateScreen(String.valueOf(this.operatorsModel.getNumberVar()));
    }

    public void updateScreen(String number){
        calculatorDisplay.setText(String.valueOf(number));
    }

    public void initializeComponents(){
        (buttonOne = this.mainActivity.findViewById(R.id.one)).setOnClickListener(buttonClick);
        (buttonTwo = this.mainActivity.findViewById(R.id.two)).setOnClickListener(buttonClick);
        (buttonThree = this.mainActivity.findViewById(R.id.three)).setOnClickListener(buttonClick);
        (buttonFour = this.mainActivity.findViewById(R.id.four)).setOnClickListener(buttonClick);
        (buttonFive = this.mainActivity.findViewById(R.id.five)).setOnClickListener(buttonClick);
        (buttonSix = this.mainActivity.findViewById(R.id.six)).setOnClickListener(buttonClick);
        (buttonSeven = this.mainActivity.findViewById(R.id.seven)).setOnClickListener(buttonClick);
        (buttonEight = this.mainActivity.findViewById(R.id.eight)).setOnClickListener(buttonClick);
        (buttonNine = this.mainActivity.findViewById(R.id.nine)).setOnClickListener(buttonClick);
        (buttonZero = this.mainActivity.findViewById(R.id.zero)).setOnClickListener(buttonClick);
        (buttonDot = this.mainActivity.findViewById(R.id.dot)).setOnClickListener(buttonClick);
        (buttonAdd = this.mainActivity.findViewById(R.id.add)).setOnClickListener(buttonClick);
        (buttonSub = this.mainActivity.findViewById(R.id.sub)).setOnClickListener(buttonClick);
        (buttonMul = this.mainActivity.findViewById(R.id.mul)).setOnClickListener(buttonClick);
        (buttonDiv = this.mainActivity.findViewById(R.id.div)).setOnClickListener(buttonClick);
        (buttonEqual = this.mainActivity.findViewById(R.id.equal)).setOnClickListener(buttonClick);
        (buttonPercentage = this.mainActivity.findViewById(R.id.percentage)).setOnClickListener(buttonClick);
        (buttonClearEverything = this.mainActivity.findViewById(R.id.clearEverything)).setOnClickListener(buttonClick);
        (buttonBackSpace = this.mainActivity.findViewById(R.id.backSpace)).setOnClickListener(buttonClick);
        calculatorDisplay = this.mainActivity.findViewById(R.id.display);
    }

    private View.OnClickListener buttonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String buttonText = ((Button)v).getText().toString();
            if(buttonText.equals("=")) {
                operatorsModel.simpleEvaluate();
                operatorsModel.setOperatorVar(String.valueOf(operatorsModel.getNumberVar()));
                updateScreen(String.valueOf(operatorsModel.getNumberVar()));
            } else if(buttonText.equals("CE")) {
                operatorsModel.setNumberVar(0);
                operatorsModel.setOperatorVar("0");
                updateScreen("0");
            } else if(buttonText.equals("C")) {
                operatorsModel.subtractOperatorVar();
                updateScreen(String.valueOf(operatorsModel.getOperatorVar()));
            } else {
                operatorsModel.appendOperatorVar(buttonText);
                updateScreen(String.valueOf(operatorsModel.getOperatorVar()));
            }
        }
    };
}