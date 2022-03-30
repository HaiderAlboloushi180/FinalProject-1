package com.example.mentapy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter {

    ArrayList<Art> artsArray;
    Context context;

    public ArtAdapter(ArrayList<Art> artsArray, Context context) {
        this.artsArray = artsArray;
        this.context = context;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.art_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return artsArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView artImageView;
        public TextView artTextView;
        public View view;

        public ViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            view = itemView;
            artImageView = itemView.findViewById(R.id.artImageView);
            artTextView  = itemView.findViewById(R.id.artText);
        }
    }
}
