package com.example.manual;

import android.content.Intent;
import android.view.View;

public class ListenerManual implements View.OnClickListener {

    MainActivity mainActivity;

    ListenerManual(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mainActivity, ManualActivity.class);
        mainActivity.startActivity(intent);
    }
}
