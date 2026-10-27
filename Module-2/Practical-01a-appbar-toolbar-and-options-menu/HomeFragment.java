// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.uicomponents;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

  EditText edtName;

  Button btnSubmit;

 @Nullable

 @Override

  public View onCreateView(@NonNull LayoutInflater inflater,

   @Nullable ViewGroup container,

    @Nullable Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_home, container, false);

    edtName = view.findViewById(R.id.edtName);

    btnSubmit = view.findViewById(R.id.btnSubmit);





Subject: Android Programming Practical                                           TYBScIT


     btnSubmit.setOnClickListener(v -> {

       String name = edtName.getText().toString();

       Toast.makeText(getActivity(),

           "Hello " + name,

          Toast.LENGTH_SHORT).show();

      });

     return view;

  }}
