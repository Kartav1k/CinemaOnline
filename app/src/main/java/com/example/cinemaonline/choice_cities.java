package com.example.cinemaonline;

import static com.example.cinemaonline.R.array.Cities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;


public class choice_cities extends Fragment {

    private static String TAG="CitiesList";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] cities1=getResources().getStringArray(Cities);
        View view=inflater.inflate(R.layout.fragment_choice_cities, container, false);
        ArrayList<CitiesClass> cities=new ArrayList<CitiesClass>();
        for (int i=0; i<13;i++){
            cities.add(new CitiesClass(i,cities1[i]));
        }
        RecyclerView recyclerView=view.findViewById(R.id.citiesList);
        CitiesAdapter.OnCityClickListener clickListener= new CitiesAdapter.OnCityClickListener() {
            @Override
            public void onCityClick(CitiesClass cities, int position) {
                Log.d(TAG,cities.getTextCities());
                Toast.makeText(getContext(),cities.getTextCities(),Toast.LENGTH_LONG).show();
            }
        };
        CitiesAdapter adapter=new CitiesAdapter(getContext(),cities,clickListener);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
    }
}