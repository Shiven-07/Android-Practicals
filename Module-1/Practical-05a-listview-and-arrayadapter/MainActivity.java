// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.listviewdemo;

    import android.os.Bundle;
    import android.widget.ArrayAdapter;
    import android.widget.ListView;
    import android.widget.Toast;

    import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

      ListView listView;

       String[] courses = {
           "B.Sc. Information Technology",
           "B.Sc. Computer Science",
         "BCA",
         "MCA",
          "M.Sc. Computer Science",
          "M.Sc. Information Technology"
        };

      @Override
       protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_main);

         listView = findViewById(R.id.listView);

         ArrayAdapter<String> adapter = new ArrayAdapter<>(
                 this,
              android.R.layout.simple_list_item_1,
              courses
             );

         listView.setAdapter(adapter);

         listView.setOnItemClickListener((parent, view, position, id) -> {

            String selectedCourse = courses[position];

           Toast.makeText(
                 MainActivity.this,
                 "Selected: " + selectedCourse,
            Toast.LENGTH_SHORT
            ).show();
           });
      }
}


Subject: Android Programming Practical                                           TYBScIT
