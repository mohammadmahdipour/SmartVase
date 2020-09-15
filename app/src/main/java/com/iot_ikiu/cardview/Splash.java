package com.iot_ikiu.cardview;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView img;
    Runnable runable;
    Handler handler;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            img = findViewById(R.id.img);
            img.animate().alpha(4000).setDuration(0);

            handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent dsp=new Intent(Splash.this,MainActivity.class);
                    startActivity(dsp);
                    finish();
                }
            },4000);
        }
    }
