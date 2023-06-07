package com.example.cinemaonline.Data.DataBase.Entity;

import android.net.Uri;
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

    @ColumnInfo(name = "video")
    private int video;

    public State(String name, int movieResource, String movieDes, int video) {
        this.name = name;
        this.movieResource = movieResource;
        this.movieDes=movieDes;
        this.video=video;
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

    public int getVideo() {
        return this.video;
    }

    public void setMovieResource(int movieResource) {
        this.movieResource = movieResource;
    }
    public void setMovieDes(String movieDes) {
        this.movieDes = movieDes;
    }
    public void setVideo(int video) {
        this.video = video;
    }
}