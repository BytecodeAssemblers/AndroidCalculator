package com.bytecodeassemblers.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
            buttonNine, buttonZero, buttonDot, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonPercentage, buttonClearEverything, buttonBackSpace;
   private TextView calculatorDisplay;
   private String displayResult="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }


    public void initializeComponents(){
        buttonOne = findViewById(R.id.one);
        buttonTwo = findViewById(R.id.two);
        buttonThree = findViewById(R.id.three);
        buttonFour = findViewById(R.id.four);
        buttonFive = findViewById(R.id.five);
        buttonSix = findViewById(R.id.six);
        buttonSeven = findViewById(R.id.seven);
        buttonEight = findViewById(R.id.eight);
        buttonNine = findViewById(R.id.nine);
        buttonZero = findViewById(R.id.zero);
        buttonDot = findViewById(R.id.dot);
        buttonAdd = findViewById(R.id.add);
        buttonSub = findViewById(R.id.sub);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.div);
        buttonEqual = findViewById(R.id.equal);
        buttonPercentage = findViewById(R.id.percentage);
        buttonClearEverything = findViewById(R.id.clearEverything);
        buttonBackSpace = findViewById(R.id.backSpace);
        calculatorDisplay = findViewById(R.id.display);
        updateScreen();
    }
    public void updateScreen(){
        calculatorDisplay.setText(displayResult);
    }


    public void BackSpace(View v){
        String result = calculatorDisplay.getText().toString();
        if(result == "0" || result.isEmpty()){
            updateScreen();
        }else {
            displayResult = result.substring(0, result.length() - 1);
            updateScreen();
        }
    }
    public void ce (View v){

        displayResult ="0";
        updateScreen();
    }
    public void percentage (View v){
        float display = Float.parseFloat(calculatorDisplay.getText().toString());
        display = display/100;
        String result = String.valueOf(display);
        displayResult=result;
        updateScreen();
    }
}
