package com.example.finalhomework_lienyu.util_classes;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User{
    private String accountString;
    private String nickNameString;
    private String passwordString;
    public User(){
    }

    public User(String accountString, String nickNameString, String passwordString){
        this.accountString = accountString;
        this.nickNameString = nickNameString;
        this.passwordString = passwordString;
    }

    public String getAccountString() {
        return accountString;
    }

    public void setAccountString(String accountString) {
        this.accountString = accountString;
    }

    public String getNickNameString() {
        return nickNameString;
    }

    public void setNickNameString(String nickNameString) {
        this.nickNameString = nickNameString;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }
}
