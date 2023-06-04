package com.example.cinemaonline.UI.state_holder;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.cinemaonline.Data.MainRepository;
import com.example.cinemaonline.Data.models.LoginPerson;

public class MainLoginViewModel extends AndroidViewModel {
    private final MainRepository repository = new MainRepository(getApplication());

    public boolean login(String login) {
        LoginPerson loginPerson = new LoginPerson(login);
        return repository.personLogin(loginPerson);
    }

    public MainLoginViewModel(@NonNull Application application) {
        super(application);
    }
}

