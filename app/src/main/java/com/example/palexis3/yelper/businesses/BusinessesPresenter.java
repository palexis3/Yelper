package com.example.palexis3.yelper.businesses;

import android.support.annotation.NonNull;

import com.example.palexis3.yelper.data.Business;
import com.example.palexis3.yelper.data.source.Repository;
import com.example.palexis3.yelper.data.source.RepositoryContract;

import java.util.List;

public class BusinessesPresenter implements BusinessesContract.Presenter, RepositoryContract.OnFinishedListener {

    private BusinessesContract.View businessListView;
    private Repository repository;

    public BusinessesPresenter(BusinessesContract.View businessListView) {
        this.businessListView = businessListView;
        repository = new Repository();
    }

    @Override
    public void onDestroy() {
        this.businessListView = null;
    }


    @Override
    public void loadBusinesses() {
        if(businessListView != null) {
            businessListView.showProgress();
        }
        repository.getBusinessesList(this);
    }

    @Override
    public void onFailure(Throwable t) {
        businessListView.onFailure(t);
        if(businessListView != null) {
            businessListView.hideProgress();
        }
    }

    @Override
    public void onFinished(List<Business> businessList) {
        businessListView.showBusinesses(businessList);
        if(businessListView != null) {
            businessList.hideProgress();
        }
    }

    @Override
    public void start() {}

    @Override
    public void openBusinessDetails(@NonNull Business requestedBusiness) {}

    @Override
    public void result(int requestCode, int resultCode) {}
}
