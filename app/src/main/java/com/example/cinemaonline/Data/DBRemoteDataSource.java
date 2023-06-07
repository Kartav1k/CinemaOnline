package com.example.cinemaonline.Data;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.cinemaonline.Data.DataBase.DataBase;
import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.Data.DataBase.Entity.User;
import com.example.cinemaonline.Data.DataBase.dao.StateDao;
import com.example.cinemaonline.Data.DataBase.dao.UserDao;
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
        String[] moviesDes = context.getResources().getStringArray(R.array.Description);
        for(int i=0;i<10;i++){
            states.add(new State (movies[i], R.drawable.logo_app, moviesDes[i]));
        }
        MutableLiveData<List<State>> liveDataState = new MutableLiveData<>();
        liveDataState.setValue(states);

        DataBase db = DataBase.getDatabase(context);
        StateDao stateDao = db.stateDao();
        SharedPreferences prefs = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        boolean isFirstRun = prefs.getBoolean("isFirstRun", true);
        if (isFirstRun) {
            // Добавление элемента в бд
            db.getQueryExecutor().execute(() -> {
                for (State state : states) {
                    stateDao.insert(state);
                }
                prefs.edit().putBoolean("isFirstRun", false).apply();
            });
        }
        return stateDao.getMovieList();
    }
    public LiveData<Boolean> LoginClass(String login, String pass){
        DataBase db = DataBase.getDatabase(context);
        UserDao userDao = db.userDao();
        return userDao.getUserByLogin(login, pass);
    }

    public LiveData<State> getItem(int position) {
        DataBase db = DataBase.getDatabase(context);
        StateDao stateDao = db.stateDao();
        return stateDao.getItem(position + 1);
    }
    public void registration(User user) {
        DataBase db = DataBase.getDatabase(context);
        UserDao userDao = db.userDao();
        db.getQueryExecutor().execute(() -> {
            userDao.insert(user);
        });
    }
}
