package com.example.sdawalib.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;

        Log.d("zaWidth",width+"");

        Animation animationToRight = new TranslateAnimation(-width,width, 0, 0);
        animationToRight.setDuration(2000);
        animationToRight.setRepeatMode(Animation.RESTART);
        animationToRight.setRepeatCount(Animation.INFINITE);


        TextView textViewMarqToRight = (TextView) findViewById(R.id.toRight);


        textViewMarqToRight.setAnimation(animationToRight);
        String textRight = "Right marquue";
        textViewMarqToRight.setText(textRight);

    }
}
