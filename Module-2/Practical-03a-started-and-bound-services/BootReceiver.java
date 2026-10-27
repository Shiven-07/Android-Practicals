// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.servicedemo;

import android.content.BroadcastReceiver;

import android.content.Context;





Subject: Android Programming Practical                                           TYBScIT


import android.content.Intent;

import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {

  @Override

  public void onReceive(Context context, Intent intent) {

if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {

   Toast.makeText(context,

        "Device Booted - Broadcast Received",

          Toast.LENGTH_LONG).show();

  // Optional: Start Service Automatically

        Intent serviceIntent = new Intent(context, MyService.class);

        context.startService(serviceIntent);

    }

  }}
