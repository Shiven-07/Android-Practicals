// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.jsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;

import android.widget.TextView;

import org.json.JSONArray;

import org.json.JSONObject;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

  Button btnFetch;

  TextView tvResult;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

     btnFetch = findViewById(R.id.btnFetch);

     tvResult = findViewById(R.id.tvResult);





Subject: Android Programming Practical                                           TYBScIT


     btnFetch.setOnClickListener(v -> fetchJSON());

  }

   private void fetchJSON() {

    new Thread(() -> {

        try {

      URL url = new URL("https://jsonplaceholder.typicode.com/users");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

         conn.setRequestMethod("GET");

         BufferedReader reader = new BufferedReader(

           new InputStreamReader(conn.getInputStream()));

          StringBuilder result = new StringBuilder();

          String line;

         while ((line = reader.readLine()) != null) {

             result.append(line);

        }

        JSONArray jsonArray = new JSONArray(result.toString());

          StringBuilder displayData = new StringBuilder();

          for (int i = 0; i < jsonArray.length(); i++) {

          JSONObject obj = jsonArray.getJSONObject(i);

           displayData.append("Name: ")

                 .append(obj.getString("name")).append("\n");

           displayData.append("Email: ")

                  .append(obj.getString("email")).append("\n\n");

        }

         runOnUiThread(() ->

               tvResult.setText(displayData.toString()));

      } catch (Exception e) {

          e.printStackTrace();

      }





Subject: Android Programming Practical                                           TYBScIT


}

).start();

  }}
