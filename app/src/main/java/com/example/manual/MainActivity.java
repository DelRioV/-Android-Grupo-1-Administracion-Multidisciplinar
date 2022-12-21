package com.example.manual;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {

    private String URL = "https://proyectomultidisciplinar2022.000webhostapp.com/getUsers.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivitylayout);
        Statement statement;
        System.out.println("asdsa");
        JsonRequests jsonRequests = new JsonRequests(this);
        jsonRequests.request(URL);

    }
}
