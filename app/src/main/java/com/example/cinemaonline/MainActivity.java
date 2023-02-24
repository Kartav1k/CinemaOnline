package com.example.cinemaonline;

import androidx.appcompat.app.AppCompatActivity;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CinemaOnline";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Авторизация");
        textView.setTextSize(32);

        setContentView(constraintLayout);
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

    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Stop activity";
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
    protected void onRestart(){
        super.onRestart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Restart activity";
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
    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Destroy activity";
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