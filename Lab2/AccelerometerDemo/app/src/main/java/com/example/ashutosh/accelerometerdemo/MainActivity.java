package com.example.ashutosh.accelerometerdemo;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private static final String TAG = "MainActivity";

    private SensorManager sensorManager;
    Sensor accelerometerSensor;
    TextView xVal, yVal, zVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xVal = (TextView) findViewById(R.id.xVal);
        yVal = (TextView) findViewById(R.id.yVal);
        zVal = (TextView) findViewById(R.id.zVal);

        Log.d(TAG, "onCreate: Initializing Sensor Services");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this,accelerometerSensor,SensorManager.SENSOR_DELAY_NORMAL);
        Log.d(TAG, "onCreate: Registered accelerometer listener");
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        xVal.setText("xValue : " + sensorEvent.values[0]);
        yVal.setText("yValue : " + sensorEvent.values[1]);
        zVal.setText("zValue : " + sensorEvent.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
