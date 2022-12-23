package com.example.manual;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectActivity extends Activity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.projectlayout);
        findViewById(R.id.btnBack2).setOnClickListener(new ListenerBackMenu(this));
        TextView tv = findViewById(R.id.tvProject);
        tv.setText("Project made by:\nPablo Salvador Del Río Vergara\nIsmael Orellana Bello\nJorge Luis López Pérez\nÁngel Acedo Moreno\nJavier Tienda\nJose Ramón Gallego");
    }
}
