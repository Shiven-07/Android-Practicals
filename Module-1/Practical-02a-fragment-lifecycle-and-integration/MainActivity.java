// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentTransaction;






Subject: Android Programming Practical                                           TYBScIT


import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button btnA, btnB;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);

     setContentView(R.layout.activity_main);

    btnA = findViewById(R.id.btnA);

    btnB = findViewById(R.id.btnB);

     btnA.setOnClickListener(new View.OnClickListener() {

      @Override

       public void onClick(View v) {

        loadFragment(new FragmentA());

      }

      });

     btnB.setOnClickListener(new View.OnClickListener() {

      @Override

       public void onClick(View v) {

        loadFragment(new FragmentB());

      }

      });

  }

   private void loadFragment(Fragment fragment) {

    FragmentManager fm = getSupportFragmentManager();

    FragmentTransaction ft = fm.beginTransaction();

     ft.replace(R.id.fragmentContainer, fragment);

     ft.commit();





Subject: Android Programming Practical                                           TYBScIT


  }}
2. Fragment A Layout (fragment_a.xml)

<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"

  android:layout_width="match_parent"

  android:layout_height="match_parent"

  android:gravity="center"

   android:orientation="vertical">

  <TextView

     android:layout_width="wrap_content"

     android:layout_height="wrap_content"

     android:text="This is Fragment A"

     android:textSize="24sp"/>

</LinearLayout>
Fragment A Java (FragmentA.java)

package com.example.fragmentsdemo;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

  @Nullable

  @Override

  public View onCreateView(@NonNull LayoutInflater inflater,

               @Nullable ViewGroup container,

               @Nullable Bundle savedInstanceState) {






Subject: Android Programming Practical                                           TYBScIT


     return inflater.inflate(R.layout.fragment_a, container, false);

  }}
Fragment B Layout (fragment_b.xml)

<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"

  android:layout_width="match_parent"

  android:layout_height="match_parent"

  android:gravity="center"

   android:orientation="vertical">

  <TextView

     android:layout_width="wrap_content"

     android:layout_height="wrap_content"

     android:text="This is Fragment B"

     android:textSize="24sp"/>

</LinearLayout>

Fragment B Java (FragmentB.java)

package com.example.fragmentsdemo;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

  @Nullable

  @Override

  public View onCreateView(@NonNull LayoutInflater inflater,

               @Nullable ViewGroup container,






Subject: Android Programming Practical                                           TYBScIT


               @Nullable Bundle savedInstanceState) {

     return inflater.inflate(R.layout.fragment_b, container, false);

  }

}
