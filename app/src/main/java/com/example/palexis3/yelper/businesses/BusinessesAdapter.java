package com.example.palexis3.yelper.businesses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.palexis3.yelper.data.Business;

import java.util.List;

public class BusinessesAdapter extends RecyclerView.Adapter<BusinessesAdapter.ViewHolder> {

    List<Business> businesses;

    public BusinessesAdapter(List<Business> businesses) {
        this.businesses = businesses;
    }

    @NonNull
    @Override
    public BusinessesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessesAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRating;
        ImageView ivBiz;

        public ViewHolder(View viewItem) {
            super(viewItem);
            tvName = (TextView) viewItem.find
        }
    }
}
