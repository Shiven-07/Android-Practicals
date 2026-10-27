// Extracted from PDF; review PDF-Extracted-Text.txt and Original-Pages.pdf before use.
package com.example.myapplication;
    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.os.Handler;
    import android.os.Message;
    import android.widget.TextView;
    import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity extends AppCompatActivity {
      TextView textView;
      Handler handler;
       @SuppressLint("MissingInflatedId")
      @Override
       protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         textView = findViewById(R.id.textView);
         handler = new Handler() {
          @Override
            public void handleMessage(Message msg) {
             textView.setText("Count : " + msg.arg1);
          }
          };
        Thread thread = new Thread(new Runnable() {
          @Override
            public void run() {
                for(int i=1;i<=10;i++){
              Message message = new Message();
               message.arg1 = i;
                handler.sendMessage(message);
                  try {
                   Thread.sleep(1000);

Subject: Android Programming Practical                                           TYBScIT


          } catch (InterruptedException e) {
               e.printStackTrace();
          }
        }
      }


      });
      thread.start(); }
}
