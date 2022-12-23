package com.example.manual;

import android.content.Intent;
import android.view.View;

public class ListenerBackMenu implements View.OnClickListener {

    ManualActivity manualActivity = null;
    ProjectActivity projectActivity = null;

    ListenerBackMenu(ManualActivity manualActivity) {
        this.manualActivity = manualActivity;
    }

    ListenerBackMenu(ProjectActivity projectActivity) {
        this.projectActivity = projectActivity;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (manualActivity != null) {
            intent = new Intent(manualActivity, MainActivity.class);
            manualActivity.startActivity(intent);
        } else {
            intent = new Intent(projectActivity, MainActivity.class);
            projectActivity.startActivity(intent);
        }
    }
}
