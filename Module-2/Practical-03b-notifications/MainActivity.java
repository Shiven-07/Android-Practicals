// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button btnStart, btnStop, btnNotify;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

     btnStart = findViewById(R.id.btnStart);

    btnStop = findViewById(R.id.btnStop);

     btnNotify = findViewById(R.id.btnNotify);

       // Start Service

     btnStart.setOnClickListener(v -> {

        Intent intent = new Intent(this, MyService.class);

        startService(intent);

       Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();

     })





Subject: Android Programming Practical                                           TYBScIT


       // Stop Service

     btnStop.setOnClickListener(v -> {

        Intent intent = new Intent(this, MyService.class);

        stopService(intent);

       Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();

      });

       // Send Notification via Service

     btnNotify.setOnClickListener(v -> {

        Intent intent = new Intent(this, MyService.class);

      intent.setAction("SEND_NOTIFICATION");

        startService(intent);

      });

  }

}
