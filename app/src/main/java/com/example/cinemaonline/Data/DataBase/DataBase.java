package com.example.cinemaonline.Data.DataBase;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.Data.DataBase.Entity.User;
import com.example.cinemaonline.Data.DataBase.dao.StateDao;
import com.example.cinemaonline.Data.DataBase.dao.UserDao;

@Database(entities = {State.class, User.class}, version = 1, exportSchema = false)
public abstract class DataBase extends RoomDatabase {

    private static volatile DataBase INSTANCE;

    public abstract StateDao stateDao();
    public abstract UserDao userDao();

    public static DataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (DataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    DataBase.class, "Movie_DataBase")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
