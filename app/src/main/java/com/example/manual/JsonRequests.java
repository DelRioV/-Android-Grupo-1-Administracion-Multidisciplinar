package com.example.manual;

import android.app.Activity;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonRequests {
    Activity activity;

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    private int requestNumber = 1;

    public JsonRequests(Activity activity) {
        this.activity = activity;
    }

    public void request(String URL, TextView tv) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    tv.setText(tv.getText() + "\n" + jsonObject.getString("Text"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("textId", String.valueOf(requestNumber));
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(activity);
        requestQueue.add(stringRequest);
    }
}
