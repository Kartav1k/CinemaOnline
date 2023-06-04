package com.example.cinemaonline.UI.state_holder;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cinemaonline.Data.MainRepository;
import com.example.cinemaonline.Data.models.State;

import java.util.List;

public class ReviewViewModel extends AndroidViewModel {

    private final MainRepository repository = new MainRepository(getApplication());

    public LiveData<List<State>> movieListLd = repository.getMovieList();

    public ReviewViewModel(@NonNull Application application) {
        super(application);
    }
}