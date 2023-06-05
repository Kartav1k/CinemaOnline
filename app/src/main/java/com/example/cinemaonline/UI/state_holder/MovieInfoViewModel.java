package com.example.cinemaonline.UI.state_holder;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cinemaonline.Data.MainRepository;
import com.example.cinemaonline.Data.DataBase.Entity.State;

public class MovieInfoViewModel extends AndroidViewModel {

    private final MainRepository repository = new MainRepository(getApplication());

    public LiveData<State> movieListItemLd;

    public void getListItem(int position) {
        movieListItemLd = repository.getItem(position);
    }

    public MovieInfoViewModel(@NonNull Application application) {
        super(application);
    }
}
