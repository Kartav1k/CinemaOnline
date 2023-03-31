package com.example.cinemaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class cities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        /*if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.citiesFragment,
                            citiesF.class, null)
                    .commit();
        }*/
    }
}