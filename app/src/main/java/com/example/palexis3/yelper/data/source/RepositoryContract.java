package com.example.palexis3.yelper.data.source;

import com.example.palexis3.yelper.data.Business;

import java.util.List;

public interface RepositoryContract {

    interface OnFinishedListener {
        void onFinished(List<Business> businessList);
        void onFailure(Throwable t);
    }

    void getBusinessesList(OnFinishedListener onFinishedListener);
}
