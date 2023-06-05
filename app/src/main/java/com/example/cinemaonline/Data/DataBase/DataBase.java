package com.example.cinemaonline.Data.DataBase;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.Data.DataBase.dao.StateDao;

@Database(entities = {State.class}, version = 1, exportSchema = false)
public abstract class DataBase extends RoomDatabase {

    private static volatile DataBase INSTANCE;

    public abstract StateDao stateDao();

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
