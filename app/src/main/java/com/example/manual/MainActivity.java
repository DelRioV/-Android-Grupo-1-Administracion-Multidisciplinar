package com.example.manual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivitylayout);
        addListeners();
    }


    private void addListeners() {
        ((Button) findViewById(R.id.btnManual)).setOnClickListener(new ListenerManual(this));
        ((Button) findViewById(R.id.btnProject)).setOnClickListener(new ListenerProject(this));
    }

}