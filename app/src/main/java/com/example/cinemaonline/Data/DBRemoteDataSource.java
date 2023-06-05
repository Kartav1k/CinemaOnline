package com.example.cinemaonline.Data;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.cinemaonline.Data.DataBase.DataBase;
import com.example.cinemaonline.Data.DataBase.dao.StateDao;
import com.example.cinemaonline.Data.models.LoginPerson;
import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.R;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
        for(int i=0;i<12;i++){
            states.add(new State (movies[i], R.drawable.logo_app));
        }
        MutableLiveData<List<State>> liveDataState = new MutableLiveData<>();
        liveDataState.setValue(states);

        DataBase db = DataBase.getDatabase(context);
        StateDao stateDao = db.stateDao();
        /*db.getQueryExecutor().execute(() -> {
           for (State state : states) {
                stateDao.insert(state);
           }
        });*/

        return liveDataState;
    }
    public boolean LoginClass(LoginPerson loginPerson, boolean allow){
/*
        String filename = "login";
        String fileContents = loginPerson.getLogin();
        File dir = context.getFilesDir();
        File file_login = new File(dir, filename);
        try {
            FileOutputStream fos = new FileOutputStream(file_login);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            writer.write(fileContents);
            writer.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (allow) {
            String filename2 = "login";
            String fileContents2 = loginPerson.getLogin();
            File file_login2 = new File("/storage/emulated/0/Android/data", filename2);
            try {
                FileOutputStream fos = new FileOutputStream(file_login2);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
                writer.write(fileContents2);
                writer.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
        return true;
    }

    public LiveData<State> getItem(int position) {
        DataBase db = DataBase.getDatabase(context);
        StateDao stateDao = db.stateDao();
        return stateDao.getItem(position + 1);
    }
}
