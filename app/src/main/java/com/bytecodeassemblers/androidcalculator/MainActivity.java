package com.bytecodeassemblers.androidcalculator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private MainActivityController buttonController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonController = new MainActivityController(this);
    }
}
