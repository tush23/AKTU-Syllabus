package com.example.chandan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.chandan.aktu_sample.R;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectyear);
    }

    public void first(View view) {
        Intent i1 =new Intent(Main2Activity.this,year1.class);
        startActivity(i1);
    }

    public void second(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch.class);
        startActivity(i2);
    }


    public void third(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch3.class);
        startActivity(i2);
    }

    public void finalyear(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch4.class);
        startActivity(i2);
    }
}
