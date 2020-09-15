package com.iot_ikiu.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.Random;

public class MoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);





        ///////////////////////////radar chart///////////////////////////////
        /*RadarChart radarChart = findViewById(R.id.radarchart);

        ArrayList<RadarEntry> visitor = new ArrayList<>();
        Random random = new Random();
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));
        visitor.add(new RadarEntry(random.nextInt(40)));

        RadarDataSet radarDataSet = new RadarDataSet(visitor,"last 6 days information");
        radarDataSet.setColor(Color.BLUE);
        radarDataSet.setLineWidth(2f);
        radarDataSet.setValueTextColor(Color.BLACK);
        radarDataSet.setValueTextSize(14f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSet);

        String[] lable = {"Monday","Tuseday","Wednesday","Thursday","Friday","sturday","Sunday"};
        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(lable));

        radarChart.setData(radarData); */

    }
}
