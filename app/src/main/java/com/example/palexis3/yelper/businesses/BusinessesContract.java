package com.example.palexis3.yelper.businesses;


import android.support.annotation.NonNull;

import com.example.palexis3.yelper.BasePresenter;
import com.example.palexis3.yelper.BaseView;
import com.example.palexis3.yelper.data.Business;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter
 */

public interface BusinessesContract {

    interface View extends BaseView<Presenter> {

        void showBusinesses(List<Business> businesses);

        void showNoBusinesses();

        void showBusinessDetailUi(String businessId);

        void showProgress();

        void hideProgress();

        void onFailure(Throwable t);
    }

    interface Presenter extends BasePresenter {

        void onDestroy();

        void result(int requestCode, int resultCode);

        void loadBusinesses();

        void openBusinessDetails(@NonNull Business requestedBusiness);
    }


}
