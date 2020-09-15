package com.iot_ikiu.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Element element = new Element();
        element.setTitle("about IOT group");
        View aboutpage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.splash)
                .addItem(new Element().setTitle("version 1.1"))
                .addItem(element)
                .addGroup("connect with us")
                .addEmail("mohamadmahdipour420@gmail.com","Mohammad Mahdipour")
                .addWebsite("ikiu.ac.ir","Imam Khomeini International Univercity")
                .addFacebook("IOT")
                .addTwitter("iot")
                .addYoutube("IOT")
                .addInstagram("iotikiu")
                .addGitHub("Khodemehran")
                .addItem(getCopyRightElement())
                .create();
        setContentView(aboutpage);
    }
    Element getCopyRightElement() {
        Element copyrighelemnt = new Element();
        @SuppressLint({"StringFormatInvalid", "LocalSuppress"}) final String copyritht = String.format(getString(R.string.app_name), Calendar.getInstance().get(Calendar.YEAR));
        copyrighelemnt.setTitle(copyritht);
        copyrighelemnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutActivity.this, copyritht, Toast.LENGTH_SHORT).show();
            }
        });
        return copyrighelemnt;

    }
}
