package com.example.cinemaonline.Data;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.cinemaonline.Data.models.LoginPerson;
import com.example.cinemaonline.Data.models.State;
import com.example.cinemaonline.R;

import java.util.ArrayList;
import java.util.List;

public class DBRemoteDataSource {
    private Context context;

    public DBRemoteDataSource(Context context) {
        this.context = context;
    }

    public LiveData<List<State>> getMovieList(){
        List<State> states = new ArrayList<>();
        String[] movies = context.getResources().getStringArray(R.array.Movies);
        for(int i=0;i<12;i++){
            states.add(new State (movies[i], R.drawable.logo_app));
        }
        MutableLiveData<List<State>> liveDataState = new MutableLiveData<>();
        liveDataState.setValue(states);
        return liveDataState;
    }
    public boolean LoginClass(LoginPerson loginPerson){
        return true;
    }

    public LiveData<State> getItem(int position) {
        List<State> states = new ArrayList<>();
        String[] movies = context.getResources().getStringArray(R.array.Movies);
        for(int i=0;i<12;i++){
            states.add(new State (movies[i], R.drawable.logo1));
        }
        MutableLiveData<State> liveDataState = new MutableLiveData<>();
        liveDataState.setValue(states.get(position));
        return liveDataState;
    }
}
