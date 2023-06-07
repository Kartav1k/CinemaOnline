package com.example.cinemaonline.Data.DataBase.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "Movies_table")
public class State {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    public Integer uid;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "movieResource")
    private int movieResource;
    @ColumnInfo(name = "movieDes")
    private String movieDes;

    public State(String name, int movieResource, String movieDes) {
        this.name = name;
        this.movieResource = movieResource;
        this.movieDes=movieDes;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMovieResource() {
        return this.movieResource;
    }

    public String getMovieDes() {
        return this.movieDes;
    }

    public void setMovieResource(int movieResource) {
        this.movieResource = movieResource;
    }
    public void setMovieDes(String movieDes) {
        this.movieDes = movieDes;
    }
}