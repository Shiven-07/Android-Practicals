// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.lifecycleapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

  String TAG = "ActivityLifecycle";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
    Log.d(TAG, "onCreate() called");
  }

  @Override
  protected void onStart() {
     super.onStart();
    Log.d(TAG, "onStart() called");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d(TAG, "onResume() called");
  }



     Subject: Android Programming Practical                                           TYBScIT

  @Override
  protected void onPause() {
     super.onPause();
    Log.d(TAG, "onPause() called");
  }

  @Override
  protected void onStop() {
     super.onStop();
    Log.d(TAG, "onStop() called");
  }

  @Override
  protected void onRestart() {
     super.onRestart();
    Log.d(TAG, "onRestart() called");
  }

  @Override
  protected void onDestroy() {
     super.onDestroy();
    Log.d(TAG, "onDestroy() called");
  }
}
