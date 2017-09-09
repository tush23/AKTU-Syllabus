package com.example.chandan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.chandan.aktu_sample.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                //start your activity here
            }

        }, 2000L);

    }

    public void next(View view) {
        Intent inten = new Intent (MainActivity.this,Main2Activity.class);
        startActivity(inten);
    }
}
