// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

    Toolbar toolbar = findViewById(R.id.toolbar);

     setSupportActionBar(toolbar);

        // Load Fragment

    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

     ft.replace(R.id.frameContainer, new HomeFragment());

     ft.commit();

  }}
