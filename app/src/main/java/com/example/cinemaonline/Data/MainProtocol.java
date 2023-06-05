package com.example.cinemaonline.Data;

import androidx.lifecycle.LiveData;


import com.example.cinemaonline.Data.models.LoginPerson;
import com.example.cinemaonline.Data.DataBase.Entity.State;

import java.util.List;

public interface MainProtocol {
    LiveData<List<State>> getMovieList();
    boolean personLogin(LoginPerson loginPerson, boolean allow);
    LiveData<State> getItem(int position);
}