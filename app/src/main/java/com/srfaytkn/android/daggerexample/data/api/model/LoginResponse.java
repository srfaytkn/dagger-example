package com.srfaytkn.android.daggerexample.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Parcel(Parcel.Serialization.BEAN)
public class LoginResponse {

    @SerializedName("token")
    @Expose
    private String token;

    public LoginResponse() {
    }

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
