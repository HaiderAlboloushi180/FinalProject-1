package com.example.mentapy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PicsAdapter extends RecyclerView.Adapter {

    ArrayList<Integer> picsList;
    Context context;

    public PicsAdapter(ArrayList<Integer> picsList, Context context) {
        this.picsList = picsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pics_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).picsImage.setImageResource(picsList.get(position));
    }

    @Override
    public int getItemCount() {
        return picsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView picsImage;
        public View view;

        public ViewHolder(@androidx.annotation.NonNull View itemView) {
            super(itemView);
            view = itemView;
            picsImage = itemView.findViewById(R.id.picImageView);
        }
    }
}
