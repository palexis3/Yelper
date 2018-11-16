package com.example.palexis3.yelper.data.source;

import android.util.Log;

import com.example.palexis3.yelper.Utility;
import com.example.palexis3.yelper.data.Business;
import com.example.palexis3.yelper.data.BusinessResponse;
import com.example.palexis3.yelper.data.source.remote.RetrofitClient;
import com.example.palexis3.yelper.data.source.remote.YelpInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository implements RepositoryContract {

    private final String TAG = Repository.class.getName();
    private YelpInterface retrofitClient = null;


    @Override
    public void getBusinessesList(final OnFinishedListener onFinishedListener) {
        if(retrofitClient == null) {
            retrofitClient = RetrofitClient.getClient().create(YelpInterface.class);
        }

        String location = "San Francisco";
        Call<BusinessResponse> call = retrofitClient.getBusinesses(location, "Bearer " + Utility.getApiKey());
        call.enqueue(new Callback<BusinessResponse>() {
            @Override
            public void onResponse(Call<BusinessResponse> call, Response<BusinessResponse> response) {
                List<Business> businessesList = response.body().getBusinesses();
                Log.d(TAG, "Number of businesses received: " + businessesList.size());
                onFinishedListener.onFinished(businessesList);
            }

            @Override
            public void onFailure(Call<BusinessResponse> call, Throwable t) {
                // We weren't able to make a network call
                Log.d(TAG, t.toString());
                onFinishedListener.onFailure(t);
            }
        });
    }
}
