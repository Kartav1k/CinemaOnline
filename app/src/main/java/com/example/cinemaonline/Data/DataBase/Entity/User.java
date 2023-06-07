package com.example.cinemaonline.Data.DataBase.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"login"},unique = true)})
public class User {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    public Integer uid;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "login")
    public String login;

    @ColumnInfo(name = "pass")
    public String pass;

    @ColumnInfo(name = "fullName")
    public String fullName;

    @ColumnInfo(name = "phoneNum")
    public String phoneNum;

    @ColumnInfo(name = "birthDate")
    public String birthDate;

    public User(String email, String login, String pass, String fullName, String phoneNum,String birthDate) {
        this.email = email;
        this.login = login;
        this.pass = pass;
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.birthDate = birthDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @NonNull
    public Integer getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }
}