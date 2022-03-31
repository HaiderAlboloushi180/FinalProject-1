package com.example.mentapy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter {

    ArrayList<Art> artsArray;
    Context context;

    public ArtAdapter(ArrayList<Art> artsArray, Context context) {
        this.artsArray = artsArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.art_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((ViewHolder) viewHolder).artImageView.setImageResource(artsArray.get(i).getArtImg());
        ((ViewHolder) viewHolder).artTextView.setText(artsArray.get(i).getArtTitle());
    }

    @Override
    public int getItemCount() {
        return artsArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView artImageView;
        public TextView artTextView;
        public View view;

        public ViewHolder(@androidx.annotation.NonNull View itemView) {
            super(itemView);
            view = itemView;
            artImageView = itemView.findViewById(R.id.artImageView);
            artTextView  = itemView.findViewById(R.id.artText);
        }
    }
}
