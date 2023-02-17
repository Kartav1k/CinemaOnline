package com.example.cinemaonline;

import androidx.appcompat.app.AppCompatActivity;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT   ;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }

    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Resume activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }

    @Override
    protected void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Pause activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG,"Fail");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Detail");
    }
}