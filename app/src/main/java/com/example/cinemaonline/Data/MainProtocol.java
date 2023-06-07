package com.example.cinemaonline.Data;

import androidx.lifecycle.LiveData;

import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.Data.DataBase.Entity.User;

import java.util.List;

public interface MainProtocol {
    LiveData<List<State>> getMovieList();

    LiveData<Boolean> loginClass(String login, String pass);

    LiveData<State> getItem(int position);
    void registration(User user);
}