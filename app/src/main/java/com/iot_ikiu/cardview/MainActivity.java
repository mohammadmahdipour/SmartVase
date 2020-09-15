package com.iot_ikiu.cardview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import static com.iot_ikiu.cardview.APP.CHANNEL_1_ID;


public class MainActivity extends AppCompatActivity {
    //private static final String CHANNEL_1_ID = ;
    CardView chart,led,mood,damp,temp,setting;
    DrawerLayout drawerLayout;
      NotificationManagerCompat notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////////////////////////////findView codes/////////////////////////////
        chart = findViewById(R.id.chart_view);
        led = findViewById(R.id.led_view);
        mood = findViewById(R.id.mood_view);
        damp = findViewById(R.id.damp_view);
        temp = findViewById(R.id.temp_view);
        setting = findViewById(R.id.setting_view);
        notificationManager = NotificationManagerCompat.from(this);
        /////////////////////notifications ////////////////////////////////////////////
      //  notifmanager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        /////////////////////onClickliseters codes : /////////////////////////////////////
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "chart", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MainChartActivity.class);
                startActivity(intent);
            }
        });
        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Led", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,LedActivity.class);
                startActivity(intent);
            }
        });
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mood", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,MoodActivity.class));
            }
        });
        damp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "damp", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,dampActivity.class));
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "temp", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,TempActivity.class);
                startActivity(intent);

            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,aboutActivity.class);
                startActivity(intent);
            }
        });

    }
    public  void testapp(View v){
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
    ////////////////////////// a function for notification ///////////////////////
//    public void sendChannel1(View v) {
  //      Notification notification = new NotificationCompat.Builder(this,CHANNEL_1_ID )
    //            .setSmallIcon(R.drawable.ic_power)
      //          .setContentTitle(" IOT Smart vase :")
        //        .setContentText("please check power!!!")
          //      .setCategory(NotificationCompat.CATEGORY_ERROR)
            //    .setPriority(NotificationCompat.PRIORITY_HIGH)
              //  .build();
      //  notificationManager.notify(1,notification);
  //  }


    @Override
    protected void onStop() {
        super.onStop();
        new CountDownTimer(300000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
               sendNotif3();
                Toast.makeText(MainActivity.this, " on Stop ", Toast.LENGTH_LONG).show();
                Notification notification = new NotificationCompat.Builder(MainActivity.this ,CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.ic_strawberry)
                        .setContentTitle(" tinered notification")
                        .setContentText(" this notification must shown after 3 Minutes than exit app")
                        .setCategory(NotificationCompat.CATEGORY_ERROR)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .build();
                notificationManager.notify(1,notification);
            }
        }.start();
    }

    @Override
    protected void onResume() {
        new CountDownTimer(300000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                sendNotif3();
                Toast.makeText(MainActivity.this, " on Stop ", Toast.LENGTH_LONG).show();
                Notification notification = new NotificationCompat.Builder(MainActivity.this ,CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.ic_strawberry)
                        .setContentTitle(" tinered notification")
                        .setContentText(" this notification must shown after 3 Minutes than exit app")
                        .setCategory(NotificationCompat.CATEGORY_ERROR)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .build();
                notificationManager.notify(1,notification);
            }
        }.start();
        super.onResume();
    }

    public void sendNotif3() {
        Toast.makeText(MainActivity.this, " on Stop ", Toast.LENGTH_LONG).show();
        Notification notification = new NotificationCompat.Builder(MainActivity.this ,CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_strawberry)
                .setContentTitle(" tinered notification")
                .setContentText(" this notification must shown after 3 Minutes than exit app")
                .setCategory(NotificationCompat.CATEGORY_ERROR)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .build();
        notificationManager.notify(1,notification);
    }

}

