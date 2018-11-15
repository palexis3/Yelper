package com.example.palexis3.yelper.data.source.remote;

import com.example.palexis3.yelper.data.BusinessResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface YelpInterface {

    @GET("/businesses/search")
    Call<BusinessResponse> getBusinesses(@Query("location") String location, @Header("Authorization") String auth);
}
