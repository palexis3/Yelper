package com.example.palexis3.yelper.businesses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.palexis3.yelper.R;
import com.example.palexis3.yelper.data.source.RepositoryViewHolder;

public class BusinessesAdapter extends RecyclerView.Adapter<RepositoryViewHolder> {

    private final BusinessesPresenter presenter;

    public BusinessesAdapter(BusinessesPresenter presenter) {
       this.presenter = presenter;
    }


    @NonNull
    @Override
    public RepositoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       return new RepositoryViewHolder(LayoutInflater.from(viewGroup.getContext()).
                                inflate(R.layout.item_business, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RepositoryViewHolder repoViewHolder, int i) {
        presenter.onBindViewHolderAtPosition(i, repoViewHolder);
    }

    @Override
    public int getItemCount() {
        return presenter.getRepositoryRowCount();
    }
}

