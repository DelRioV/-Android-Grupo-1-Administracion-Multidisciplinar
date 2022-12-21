package com.example.manual;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

public class ManualActivity extends Activity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manuallayout);
        findViewById(R.id.btnBack1).setOnClickListener(new ListenerBackMenu(this));

    }
}
