// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.securitypermission;

import android.Manifest;

import android.content.pm.PackageManager;

import android.os.Bundle;

import android.widget.Button;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import androidx.core.app.ActivityCompat;

import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

  Button btnPermission;

   private static final int CAMERA_PERMISSION_CODE = 100;






Subject: Android Programming Practical                                           TYBScIT


  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

     btnPermission = findViewById(R.id.btnPermission);

     btnPermission.setOnClickListener(v -> checkPermission());

  }

   private void checkPermission() {

       if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)

       == PackageManager.PERMISSION_GRANTED) {

       Toast.makeText(this, "Camera Permission Already Granted",
Toast.LENGTH_SHORT).show();

    } else {

       ActivityCompat.requestPermissions(this,

         new String[]{Manifest.permission.CAMERA},

        CAMERA_PERMISSION_CODE);

    }  }

  @Override

  public void onRequestPermissionsResult(int requestCode, String[] permissions, int[]
grantResults) {

     super.onRequestPermissionsResult(requestCode, permissions, grantResults);

       if (requestCode == CAMERA_PERMISSION_CODE) {

          if (grantResults.length > 0 && grantResults[0] ==
PackageManager.PERMISSION_GRANTED) {

         Toast.makeText(this, "Camera Permission Granted",
Toast.LENGTH_SHORT).show();

      } else {

         Toast.makeText(this, "Camera Permission Denied",
Toast.LENGTH_SHORT).show();

      }

 }  } }




Subject: Android Programming Practical                                           TYBScIT
