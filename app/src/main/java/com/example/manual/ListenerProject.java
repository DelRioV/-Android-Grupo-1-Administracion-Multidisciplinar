package com.example.manual;

import android.content.Intent;
import android.view.View;

public class ListenerProject implements View.OnClickListener {

    MainActivity mainActivity;

    ListenerProject(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mainActivity, ProjectActivity.class);
        mainActivity.startActivity(intent);
    }
}
