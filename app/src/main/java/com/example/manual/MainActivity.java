package com.example.manual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {

    private final static String URL = "https://proyectomultidisciplinar2022.000webhostapp.com/getUsers.php";

    public static String getURL() {
        return URL;
    }

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