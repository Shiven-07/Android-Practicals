// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
Right-click your package → New → Java Class

StudentAdapter

package com.example.recyclerviewdemo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentAdapter
     extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

   String[] names = {
       "Amit",
       "Rahul",
       "Sneha",
       "Pooja",
       "Rohit"
   };

   String[] courses = {
      "BSc IT",
      "BSc CS",
      "BCA",
     "MCA",
      "BSc IT"
   };

  @NonNull
  @Override
  public StudentViewHolder onCreateViewHolder(
     @NonNull ViewGroup parent, int viewType) {

    View view = LayoutInflater.from(parent.getContext())
          .inflate(R.layout.item_student, parent, false);

     return new StudentViewHolder(view);
  }

  @Override
  public void onBindViewHolder(


     Subject: Android Programming Practical                                           TYBScIT

     @NonNull StudentViewHolder holder, int position) {

     holder.txtName.setText(names[position]);
     holder.txtCourse.setText(courses[position]);
  }

  @Override
  public int getItemCount() {
     return names.length;
  }

   static class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView txtName, txtCourse;

     public StudentViewHolder(@NonNull View itemView) {
       super(itemView);

      txtName = itemView.findViewById(R.id.txtName);
       txtCourse = itemView.findViewById(R.id.txtCourse);
    }
  }
}
