// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.ArrayAdapter;

import android.widget.Button;

import android.widget.ListView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button btnIntent, btnToast, btnLongClick;

  ListView listView;

   String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);





Subject: Android Programming Practical                                           TYBScIT


     setContentView(R.layout.activity_main);

     btnIntent = findViewById(R.id.btnIntent);

     btnToast = findViewById(R.id.btnToast);

    btnLongClick = findViewById(R.id.btnLongClick);

     listView = findViewById(R.id.listView);

       // Explicit Intent

     btnIntent.setOnClickListener(v -> {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(intent);

      });

       // Click Event Listener

     btnToast.setOnClickListener(v ->

         Toast.makeText(MainActivity.this,

             "Button Clicked!",

            Toast.LENGTH_SHORT).show());

       // Long Click Listener

    btnLongClick.setOnLongClickListener(v -> {

       Toast.makeText(MainActivity.this,

          "Long Press Detected!",

          Toast.LENGTH_SHORT).show();

        return true;

      });

       // Adapter Example

    ArrayAdapter<String> adapter =

       new ArrayAdapter<>(this,

               android.R.layout.simple_list_item_1,

               items);



     listView.setAdapter(adapter);





Subject: Android Programming Practical                                           TYBScIT


       // List Item Click Event

     listView.setOnItemClickListener((parent, view, position, id) ->

         Toast.makeText(MainActivity.this,

               "Selected: " + items[position],

            Toast.LENGTH_SHORT).show()) }`}
