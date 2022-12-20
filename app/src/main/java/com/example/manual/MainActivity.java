package com.example.manual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivitylayout);
        Statement st = new ConnectionDB().getRemoteConnection();
        ResultSet rs;
        TextView tv = findViewById(R.id.textView);
        try {
            rs = st.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                tv.setText(tv.getText() + rs.getString(1) + "\n");
            }
        } catch (SQLException e) {
        }

    }
}
