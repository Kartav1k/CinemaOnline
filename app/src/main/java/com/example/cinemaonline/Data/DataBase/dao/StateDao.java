package com.example.cinemaonline.Data.DataBase.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.cinemaonline.Data.DataBase.Entity.State;

import java.util.List;

@Dao
public interface StateDao {
    @Query("SELECT * FROM movies_table")
    LiveData<List<State>> getCarList();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(State state);

    @Query("SELECT * FROM movies_table WHERE :id LIKE id")
    LiveData<State> getItem(int id);
}
