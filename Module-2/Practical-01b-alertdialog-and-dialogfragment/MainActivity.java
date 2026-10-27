// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.menudialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AlertDialog;

import androidx.fragment.app.DialogFragment;

import android.os.Bundle;

import android.view.ContextMenu;






Subject: Android Programming Practical                                           TYBScIT


import android.view.Menu;

import android.view.MenuItem;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btnDialog, btnFragmentDialog;

 TextView txtContext;

@Override

 protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

btnDialog = findViewById(R.id.btnDialog);

    btnFragmentDialog = findViewById(R.id.btnFragmentDialog);

     txtContext = findViewById(R.id.txtContext);

// Register Context Menu

     registerForContextMenu(txtContext);

       // Alert Dialog

     btnDialog.setOnClickListener(v -> {

       AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Alert")

            .setMessage("This is Alert Dialog")

            .setPositiveButton("OK", (dialog, which) ->

                Toast.makeText(this, "OK Clicked", Toast.LENGTH_SHORT).show())

            .setNegativeButton("Cancel", null)

            .show();

 });

       // Dialog Fragment





Subject: Android Programming Practical                                           TYBScIT


     btnFragmentDialog.setOnClickListener(v -> {

      DialogFragment dialog = new MyDialogFragment();

       dialog.show(getSupportFragmentManager(), "MyDialog");

      });

  }

    // Options Menu

  @Override

  public boolean onCreateOptionsMenu(Menu menu) {

     getMenuInflater().inflate(R.menu.menu_main, menu);

     return true;

  }

  @Override

  public boolean onOptionsItemSelected(MenuItem item) {

       if (item.getItemId() == R.id.menu_about) {

       Toast.makeText(this, "Menu: About", Toast.LENGTH_SHORT).show();

        return true;

    } else if (item.getItemId() == R.id.menu_exit) {

         finish();

        return true;

    }

     return super.onOptionsItemSelected(item);

  }

    // Context Menu

  @Override

  public void onCreateContextMenu(ContextMenu menu, View v,

                   ContextMenu.ContextMenuInfo menuInfo) {

    super.onCreateContextMenu(menu, v, menuInfo);

     menu.setHeaderTitle("Context Menu");

    menu.add(0, 1, 0, "Edit");





Subject: Android Programming Practical                                           TYBScIT


    menu.add(0, 2, 0, "Delete");

  }

  @Override

  public boolean onContextItemSelected(MenuItem item) {

       if (item.getItemId() == 1) {

       Toast.makeText(this, "Edit Selected", Toast.LENGTH_SHORT).show();

    } else if (item.getItemId() == 2) {

       Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();

    }

     return true;

  }

}

Create Dialog Fragment Class

package com.example.menudialogdemo;

import android.app.Dialog;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;

import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

  @Override

  public Dialog onCreateDialog(Bundle savedInstanceState) {

     return new AlertDialog.Builder(requireActivity())

          .setTitle("Dialog Fragment")

         .setMessage("This is Dialog Fragment Example")

         .setPositiveButton("OK", null)

           .create();

  }






Subject: Android Programming Practical                                           TYBScIT
