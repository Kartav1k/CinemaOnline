package com.example.cinemaonline.Data.models;

public class State {
    private String name;
    private int movieResource;

    public State(String name, int flag){
        this.name=name;
        this.movieResource=flag;
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
    public void setMovieResource(int movieResource) {
        this.movieResource = movieResource;
    }
}