package com.example.cinemaonline;

public class CitiesClass {
    private  int imageRes;
    private  String textCities;

    public CitiesClass(int imageRes, String textCities){
        this.imageRes=imageRes;
        this.textCities=textCities;
    }
    public void setImageRes(int imageRes){
        this.imageRes=imageRes;
    }
    public void setTextCities(String textCities){
        this.textCities=textCities;
    }

    public int getImageRes(){return imageRes;}

    public String getTextCities(){return textCities;}
}
