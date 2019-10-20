package com.bytecodeassemblers.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
            buttonNine, buttonZero, buttonDot, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonPercentage, buttonClearEverything, buttonBackSpace;
   private TextView calculatorDisplay;

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
    }
}
