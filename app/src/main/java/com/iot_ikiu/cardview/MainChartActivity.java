package com.iot_ikiu.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Random;

public class MainChartActivity extends AppCompatActivity {
    BarChart tempChart ;
    LineChart lineChart;
    BarChart test ;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chart);
        tempChart = findViewById(R.id.tempChart);
        lineChart = findViewById(R.id.dampChart);
        test = findViewById(R.id.testchart);
        setTempChart();
        setDampChart();
       setLightChart();

        /*   this is a simple lineCHart that we dont need it
        lineChart = findViewById(R.id.LineChart);
        LineDataSet lineDataSet =new LineDataSet(LineChartdataSet(),"date set!");
        ArrayList<ILineDataSet> iLineDataSets =new ArrayList<>();
        iLineDataSets.add(lineDataSet);

        LineData lineData =new LineData(iLineDataSets);
        lineChart.setData(lineData);
        lineChart.invalidate();
        lineChart.setNoDataText("Oops! No data Availble");

    }

    private ArrayList<Entry> LineChartdataSet(){
        ArrayList<Entry> datelist = new ArrayList<>();

        Random random = new Random();
        datelist.add((Entry) new Entry(0,random.nextInt(200)));
        datelist.add((Entry) new Entry(1,random.nextInt(200)));
        datelist.add((Entry) new Entry(2,random.nextInt(200)));
        datelist.add((Entry) new Entry(3,random.nextInt(200)));
        datelist.add((Entry) new Entry(4,random.nextInt(200)));
        datelist.add((Entry) new Entry(5,random.nextInt(200)));
        datelist.add((Entry) new Entry(6,random.nextInt(200)));
        datelist.add((Entry) new Entry(7,random.nextInt(200)));
        datelist.add((Entry) new Entry(8,random.nextInt(200)));
        return datelist; */

    }
    public void setTempChart() {
        ArrayList<BarEntry> visitor = new ArrayList<>();
        visitor.add(new BarEntry(00,23));
        visitor.add(new BarEntry(1,20));
        visitor.add(new BarEntry(2,22));
        visitor.add(new BarEntry(3,24));
        visitor.add(new BarEntry(4,20));
        visitor.add(new BarEntry(5,19));
        visitor.add(new BarEntry(6,24));
        visitor.add(new BarEntry(7,23));
        visitor.add(new BarEntry(8,25));
        visitor.add(new BarEntry(9,23));
        visitor.add(new BarEntry(10,21));
        visitor.add(new BarEntry(11,20));
        visitor.add(new BarEntry(12,19));
        visitor.add(new BarEntry(13,18));
        visitor.add(new BarEntry(14,20));
        visitor.add(new BarEntry(15,23));
        visitor.add(new BarEntry(16,24));
        visitor.add(new BarEntry(17,22));
        visitor.add(new BarEntry(18,21));
        visitor.add(new BarEntry(19,25));
        visitor.add(new BarEntry(20,20));
        visitor.add(new BarEntry(21,22));
        visitor.add(new BarEntry(22,23));
        visitor.add(new BarEntry(23,20));


        BarDataSet  barDataSet = new BarDataSet(visitor,"temperature for last 24 hours");
        barDataSet.setColors(R.color.blue);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setBarBorderWidth(1f);
       // barDataSet.setGradientColor(Color.WHITE,R.color.blue);

        BarData barData = new BarData(barDataSet);
        tempChart.setFitBars(true);
        tempChart.setData(barData);
        tempChart.getDescription().setText(" designed by IOT--> IKIU ");
        tempChart.animateY(2000);

    }
    public void setDampChart() {
        ArrayList<Entry> visitor = new ArrayList<>();
        visitor.add(new BarEntry(00,23));
        visitor.add(new BarEntry(1,20));
        visitor.add(new BarEntry(2,22));
        visitor.add(new BarEntry(3,24));
        visitor.add(new BarEntry(4,20));
        visitor.add(new BarEntry(5,19));
        visitor.add(new BarEntry(6,24));
        visitor.add(new BarEntry(7,23));
        visitor.add(new BarEntry(8,25));
        visitor.add(new BarEntry(9,23));
        visitor.add(new BarEntry(10,21));
        visitor.add(new BarEntry(11,20));
        visitor.add(new BarEntry(12,19));
        visitor.add(new BarEntry(13,18));
        visitor.add(new BarEntry(14,20));
        visitor.add(new BarEntry(15,23));
        visitor.add(new BarEntry(16,24));
        visitor.add(new BarEntry(17,22));
        visitor.add(new BarEntry(18,21));
        visitor.add(new BarEntry(19,25));
        visitor.add(new BarEntry(20,20));
        visitor.add(new BarEntry(21,22));
        visitor.add(new BarEntry(22,23));
        visitor.add(new BarEntry(23,20));

        LineDataSet lineDataSet = new LineDataSet(visitor,"damp for last 24 hours");
        lineDataSet.setDrawFilled(true);
        //lineDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        //lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        LineData lineData = new LineData(lineDataSet);
        lineChart.saveToGallery("mychart");
        //lineChart.saveToPath("save to path :",null);
        lineChart.setData(lineData);

    }
    public void setLightChart() {
        ArrayList<BarEntry> visitor = new ArrayList<>();
        visitor.add(new BarEntry(00,23));
        visitor.add(new BarEntry(1,20));
        visitor.add(new BarEntry(2,22));
        visitor.add(new BarEntry(3,24));
        visitor.add(new BarEntry(4,20));
        visitor.add(new BarEntry(5,19));
        visitor.add(new BarEntry(6,24));
        visitor.add(new BarEntry(7,23));
        visitor.add(new BarEntry(8,25));
        visitor.add(new BarEntry(9,23));
        visitor.add(new BarEntry(10,21));
        visitor.add(new BarEntry(11,20));
        visitor.add(new BarEntry(12,19));
        visitor.add(new BarEntry(13,18));
        visitor.add(new BarEntry(14,20));
        visitor.add(new BarEntry(15,23));
        visitor.add(new BarEntry(16,24));
        visitor.add(new BarEntry(17,22));
        visitor.add(new BarEntry(18,21));
        visitor.add(new BarEntry(19,25));
        visitor.add(new BarEntry(20,20));
        visitor.add(new BarEntry(21,22));
        visitor.add(new BarEntry(22,23));
        visitor.add(new BarEntry(23,20));

        BarDataSet barDataSet = new BarDataSet(visitor," mesure of light for last 24 hours");
        //barDataSet.setBarShadowColor(R.color.blue);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setBarBorderWidth(1f);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        BarData barData = new BarData(barDataSet);
        test.setData(barData);
        test.setFitBars(true);
        
        test.getDescription().setText(" designed by IOT--> IKIU ");
        test.animateY(2000); }

}

