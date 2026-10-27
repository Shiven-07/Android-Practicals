// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;

import android.os.Bundle;

import android.view.View;

import android.widget.*;






Subject: Android Programming Practical                                           TYBScIT


public class MainActivity extends AppCompatActivity {

  EditText etName, etMarks;

  Button btnInsert, btnView, btnUpdate, btnDelete;

  TextView tvResult;

  DatabaseHelper myDb;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

   myDb = new DatabaseHelper(this);

    etName = findViewById(R.id.etName);

    etMarks = findViewById(R.id.etMarks);

     btnInsert = findViewById(R.id.btnInsert);

    btnView = findViewById(R.id.btnView);

    btnUpdate = findViewById(R.id.btnUpdate);

     btnDelete = findViewById(R.id.btnDelete);

     tvResult = findViewById(R.id.tvResult);

     btnInsert.setOnClickListener(view -> {

       boolean isInserted = myDb.insertData(

            etName.getText().toString(),

             etMarks.getText().toString());

          if (isInserted)

          Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();

        else

         Toast.makeText(this, "Data Not Inserted", Toast.LENGTH_SHORT).show();

      });

     btnView.setOnClickListener(view -> {

       Cursor res = myDb.getAllData();

          if (res.getCount() == 0) {





Subject: Android Programming Practical                                           TYBScIT


         tvResult.setText("No Data Found");

           return;

      }

       StringBuffer buffer = new StringBuffer();

       while (res.moveToNext()) {

         buffer.append("ID : " + res.getString(0) + "\n");

         buffer.append("Name : " + res.getString(1) + "\n");

         buffer.append("Marks : " + res.getString(2) + "\n\n");

      }

        tvResult.setText(buffer.toString());

      });

     btnUpdate.setOnClickListener(view -> {

       String id = "1"; // Example: updating ID 1

       boolean isUpdate = myDb.updateData(

               id,

            etName.getText().toString(),

             etMarks.getText().toString());

          if (isUpdate)

          Toast.makeText(this, "Data Updated", Toast.LENGTH_SHORT).show();

        else

         Toast.makeText(this, "Data Not Updated", Toast.LENGTH_SHORT).show();

      });

     btnDelete.setOnClickListener(view -> {

       String id = "1"; // Example: deleting ID 1

       Integer deletedRows = myDb.deleteData(id);

          if (deletedRows > 0)

          Toast.makeText(this, "Data Deleted", Toast.LENGTH_SHORT).show();

        else

         Toast.makeText(this, "Data Not Deleted", Toast.LENGTH_SHORT).show();





Subject: Android Programming Practical                                           TYBScIT


      });

  }

}
