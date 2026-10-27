// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.recyclerviewdemo;
    import android.os.Bundle;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;
    public class MainActivity extends AppCompatActivity {

      RecyclerView recyclerView;

      @Override
       protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.recyclerView);

         recyclerView.setLayoutManager(
           new LinearLayoutManager(this));

         StudentAdapter adapter = new StudentAdapter();

         recyclerView.setAdapter(adapter);
      }
}





Subject: Android Programming Practical                                           TYBScIT
