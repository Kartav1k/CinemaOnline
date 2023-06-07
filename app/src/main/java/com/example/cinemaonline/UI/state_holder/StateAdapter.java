package com.example.cinemaonline.UI.state_holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.R;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{
    public interface OnStateClickListener{
        void onStateClick(State state, int position);
    }
    public final OnStateClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<State> states;

    public StateAdapter(Context context, List<State> states, OnStateClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        State state = states.get(position);
        holder.movieView.setImageResource(state.getMovieResource());
        holder.nameView.setText(state.getName());
        holder.desView.setText(state.getMovieDes());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onStateClick(state, position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return states.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView movieView;
        final TextView desView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            movieView = view.findViewById(R.id.flag);
            desView = view.findViewById(R.id.des);
            nameView = view.findViewById(R.id.txt);
        }
    }
}
