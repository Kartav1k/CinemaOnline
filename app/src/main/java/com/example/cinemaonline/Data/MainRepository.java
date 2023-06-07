package com.example.cinemaonline.Data;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.cinemaonline.Data.DataBase.Entity.User;
import com.example.cinemaonline.Data.DataBase.Entity.State;

import java.util.List;

public class MainRepository implements MainProtocol {
    private Context context;
    private DBRemoteDataSource dataSource;

    public MainRepository(Context context) {
        this.context = context;
        dataSource = new DBRemoteDataSource(context);
    }

    @Override
    public LiveData<List<State>> getMovieList() {
        return dataSource.getMovieList();
    }

    @Override
    public LiveData<Boolean> loginClass(String login, String pass) {
        return dataSource.LoginClass(login, pass);
    }
    @Override
    public LiveData<State> getItem(int position) {
        return dataSource.getItem(position);
    }

    @Override
    public void registration(User user) {
        dataSource.registration(user);
    }
}