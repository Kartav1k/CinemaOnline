package com.example.cinemaonline.UI.state_holder;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.cinemaonline.Data.DataBase.Entity.User;
import com.example.cinemaonline.Data.MainRepository;

public class RegistrationViewModel extends AndroidViewModel {
    public RegistrationViewModel(@NonNull Application application) {
        super(application);
    }

    private MainRepository repository = new MainRepository(getApplication());

    public void registration(User user) {
        repository.registration(user);
    }

}
