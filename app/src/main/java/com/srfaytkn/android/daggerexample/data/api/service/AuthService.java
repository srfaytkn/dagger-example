package com.srfaytkn.android.daggerexample.data.api.service;

import com.srfaytkn.android.daggerexample.data.api.model.LoginRequest;
import com.srfaytkn.android.daggerexample.data.api.model.LoginResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by srfaytkn on 10/25/17.
 */

public interface AuthService {

    @POST("login")
    Observable<LoginResponse> login(@Body LoginRequest loginRequest);

}
