package com.example.palexis3.yelper.businesses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.palexis3.yelper.R;
import com.example.palexis3.yelper.data.Business;

import java.util.List;

public class BusinessesFragment extends Fragment implements BusinessesContract.View {

    private BusinessesContract.Presenter presenter;
    private BusinessesAdapter adapter;
    private List<Business> businessList;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_businesses, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvBusiness);

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void onFailure(Throwable t) {

    }

    @Override
    public void setPresenter(BusinessesContract.Presenter presenter) {

    }

    @Override
    public void showBusinesses(List<Business> businesses) {

    }

    @Override
    public void showNoBusinesses() {

    }

    @Override
    public void showBusinessDetailUi(String businessId) {

    }
}
