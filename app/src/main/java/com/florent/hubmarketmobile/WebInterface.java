package com.florent.hubmarketmobile;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface WebInterface {
    @POST("login")
    Call<Token> connexionUser(@Body User user);
}

