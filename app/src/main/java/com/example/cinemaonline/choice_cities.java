package com.example.cinemaonline;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;


public class choice_cities extends Fragment {

    private static String TAG="CitiesList";
    ArrayList<E> cities = new ArrayList<Object>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_choice_cities, container, false);
        ArrayList<City> cities=new ArrayList<City>();
        for (int i=0; i<20;i++){
            cities.add(new City(cities[i]));
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        citiesList = view.findViewById(R.id.rec_list);
        StateAdapter adapter;
        adapter = new StateAdapter(this, cities);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        itemsList.setLayoutManager(layoutManager);
        // устанавливаем для списка адаптер
        itemsList.setAdapter(adapter);

        recyclerView.set(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Log.d(TAG, selectedItem);
                Toast.makeText(getContext(), selectedItem, Toast.LENGTH_LONG).show();
            }
        });
    }

}