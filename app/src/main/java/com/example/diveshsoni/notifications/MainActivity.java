package com.example.diveshsoni.notifications;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.abc);

    }
    public void getNotification(View view){
        NewMessageNotification newMessageNotification = new NewMessageNotification();
        newMessageNotification.notify(this,"Hey",5);
    }
}
