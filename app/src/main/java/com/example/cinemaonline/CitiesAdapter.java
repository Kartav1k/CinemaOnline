package com.example.cinemaonline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class CitiesAdapter extends RecyclerView.Adapter< CitiesAdapter.ViewHolder> {

    interface OnCityClickListener{
        void onCityClick(CitiesClass cities, int position);
    }
    private final OnCityClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<CitiesClass> cities;

    public CitiesAdapter(Context context, List<CitiesClass> cities, OnCityClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.cities = cities;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public CitiesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CitiesClass city=cities.get(position);
        holder.cityView.setImageResource(city.getImageRes());
        holder.nameView.setText(city.getTextCities());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onCityClick(city, position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return cities.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView cityView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            cityView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.txt);
        }
    }
}


