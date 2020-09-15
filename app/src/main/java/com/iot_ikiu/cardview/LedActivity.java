package com.iot_ikiu.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import org.w3c.dom.Entity;

import java.util.ArrayList;

import static com.iot_ikiu.cardview.APP.CHANNEL_1_ID;
import static com.iot_ikiu.cardview.APP.CHANNEL_2_ID;

public class LedActivity extends AppCompatActivity {
    View v;
    Switch switchbtn;
    NotificationManagerCompat notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        switchbtn = findViewById(R.id.switch2);
        notificationManager = NotificationManagerCompat.from(this);
        sendOnChannel2(v);

        switchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchbtn.isChecked())
                    Toast.makeText(LedActivity.this, "on", Toast.LENGTH_SHORT).show();

                else
                    Toast.makeText(LedActivity.this, "off", Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void sendChannel1(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
        Notification notification = new NotificationCompat.Builder(this,CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_power)
                .setContentTitle(" IOT Smart vase :")
                .setContentText("please check power!!!")
                .setCategory(NotificationCompat.CATEGORY_ERROR)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();
        notificationManager.notify(1,notification);}
    public void sendOnChannel2 (View v){
        /////////////////////////////// settinf a action button for notification //////////////////////////////////
        Intent alertIntent = new Intent(this,MoodActivity.class);
        PendingIntent pendingIntent1 = PendingIntent.getActivity(this,0,alertIntent,0);


        ///////////////////////////// seting a intent, when user tap on notification what happen??/////////////
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);


        //////////////////////////// making notification //////////////////////////////////////
        Notification notification = new NotificationCompat.Builder(this,CHANNEL_2_ID )
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText(" Humidity is 26 !!!!")
                .setContentTitle("Moisture reduction")
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setContentIntent(pendingIntent)
                .addAction(R.drawable.ic_strawberry,"Open mood!",pendingIntent1)
                .setAutoCancel(true)
                .build();
        notificationManager.notify(2,notification);
    }

}
