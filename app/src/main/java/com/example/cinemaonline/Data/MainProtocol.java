package com.example.cinemaonline.Data;

import androidx.lifecycle.LiveData;


import com.example.cinemaonline.Data.models.LoginPerson;
import com.example.cinemaonline.Data.models.State;

import java.util.List;

public interface MainProtocol {
    LiveData<List<State>> getMovieList();
    boolean personLogin(LoginPerson loginPerson);
    LiveData<State> getItem(int position);
}