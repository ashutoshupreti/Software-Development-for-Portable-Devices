package com.example.ashutosh.sdpd_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startProximitySensor(View view){
        startActivity(new Intent(MainActivity.this, ProximitySensorActivity.class));
    }

    public void startAccelerometer(View view){
        startActivity(new Intent(MainActivity.this, AccelerometerActivity.class));
    }

    public void startCompass(View view){
        startActivity(new Intent(MainActivity.this, CompassActivity.class));
    }
}
