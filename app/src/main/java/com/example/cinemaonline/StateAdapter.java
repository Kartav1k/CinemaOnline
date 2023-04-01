package com.example.cinemaonline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter< StateAdapter.ViewHolder>{
    interface onCityClickListener{
        void onCityClick(City city, int position);
    }
    private final onCityClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<City> cities;


    StateAdapter(Context context, List<City> cities, onCityClickListener onClickListener) {
        this.onClickListener=onClickListener;
        this.cities = cities;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        City city = cities.get(position);
        holder.textView.setText(city.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onCityClick(city,position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return cities.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        ViewHolder(View view){
            super(view);
            textView = view.findViewById(R.id.txt);
        }
    }
}
