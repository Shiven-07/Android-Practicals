// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.servicedemo;

import android.app.NotificationChannel;

import android.app.NotificationManager;

import android.app.Service;

import android.content.Intent;

import android.os.Build;

import android.os.IBinder;

import androidx.core.app.NotificationCompat;

public class MyService extends Service {

  private static final String CHANNEL_ID = "ServiceChannel";

 @Override

  public int onStartCommand(Intent intent, int flags, int startId) {

if (intent != null && "SEND_NOTIFICATION".equals(intent.getAction())) {

       sendNotification() }





Subject: Android Programming Practical                                           TYBScIT


 return START_STICKY;

 }

 private void sendNotification() {

 NotificationManager manager =

   (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

  // Notification Channel (For Android 8+)

       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

       NotificationChannel channel = new NotificationChannel(

        CHANNEL_ID,

            "Service Channel",

          NotificationManager.IMPORTANCE_DEFAULT);

       manager.createNotificationChannel(channel);

    }

  NotificationCompat.Builder builder =

       new NotificationCompat.Builder(this, CHANNEL_ID)

               .setContentTitle("Service Notification")

              .setContentText("This is a Notification from Service")

               .setSmallIcon(android.R.drawable.ic_dialog_info)

               .setAutoCancel(true);

  manager.notify(1, builder.build());

  }

 @Override

  public IBinder onBind(Intent intent) {

     return null;

  }}
