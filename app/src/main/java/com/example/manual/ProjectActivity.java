package com.example.manual;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

public class ProjectActivity extends Activity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.projectlayout);
        findViewById(R.id.btnBack2).setOnClickListener(new ListenerBackMenu(this));
        JsonRequests jsonRequests = new JsonRequests(this);
        jsonRequests.request(MainActivity.getURL(), findViewById(R.id.tvProject));

    }
}
