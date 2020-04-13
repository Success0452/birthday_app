package com.famous.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;
    private Button button;

    int[] images = {
            R.drawable.w1,
            R.drawable.w2,
            R.drawable.w3,
            R.drawable.w4,
            R.drawable.w5,
            R.drawable.w6,
            R.drawable.w7,
            R.drawable.w8,
            R.drawable.w9,
            // R.drawable.w10,
            //R.drawable.w11,
            //R.drawable.w12,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v_flipper = findViewById(R.id.v_flipper);
        for (int image : images)
            flip_image(image);
    }

    private void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.fade_in);
        v_flipper.setOutAnimation(this, android.R.anim.fade_out);
    }
}



