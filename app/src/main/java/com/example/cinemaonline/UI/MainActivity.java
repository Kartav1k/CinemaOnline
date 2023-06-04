package com.example.cinemaonline.UI;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.cinemaonline.R;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CinemaOnline";
    static final String message = "Exit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}