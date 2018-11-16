package com.example.palexis3.yelper.data.source;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class RepositoryViewHolder extends RecyclerView.ViewHolder implements RepositoryRowView {

    TextView nameTextView;
    TextView ratingTextView;
    ImageView bizImage;

    @Override
    public void setImage(String image) {

    }

    public RepositoryViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setRating(String rating) {

    }
}
