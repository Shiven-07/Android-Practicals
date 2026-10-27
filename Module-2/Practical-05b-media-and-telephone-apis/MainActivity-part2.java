// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.telephoneapi;

import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  EditText number;

  Button call;





Subject: Android Programming Practical                                           TYBScIT


  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

    number = findViewById(R.id.number);

      call = findViewById(R.id.call);

     call.setOnClickListener(new View.OnClickListener() {

      @Override

       public void onClick(View v) {

          String num = number.getText().toString();

          Intent intent = new Intent(Intent.ACTION_DIAL);

          intent.setData(Uri.parse("tel:" + num));

           startActivity(intent);

      } });  } }
