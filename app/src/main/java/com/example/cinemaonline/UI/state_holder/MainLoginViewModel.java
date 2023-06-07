package com.example.cinemaonline.UI.state_holder;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cinemaonline.Data.MainRepository;
import com.example.cinemaonline.Data.models.LoginPerson;

public class MainLoginViewModel extends AndroidViewModel {
    private final MainRepository repository = new MainRepository(getApplication());


    public LiveData<Boolean> login(String login, String pass) {
        return repository.loginClass(login, pass);
    }

    public MainLoginViewModel(@NonNull Application application) {
        super(application);
    }
}

