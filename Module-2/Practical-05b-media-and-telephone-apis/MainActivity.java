// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.mediaapi;

import android.media.MediaPlayer;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

Button play, stop;






Subject: Android Programming Practical                                           TYBScIT


  MediaPlayer mediaPlayer;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

     play = findViewById(R.id.play);

     stop = findViewById(R.id.stop);

    mediaPlayer = MediaPlayer.create(this, R.raw.music);

     play.setOnClickListener(new View.OnClickListener() {

      @Override

       public void onClick(View v) {

          mediaPlayer.start();

      }

      });

     stop.setOnClickListener(new View.OnClickListener() {

      @Override

       public void onClick(View v) {

          mediaPlayer.stop();

      }

      });

  }

}






Subject: Android Programming Practical                                           TYBScIT
