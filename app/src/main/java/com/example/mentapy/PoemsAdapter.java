package com.example.mentapy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PoemsAdapter extends RecyclerView.Adapter {

    ArrayList<Poems> poems;
    Context context;

    public PoemsAdapter(ArrayList<Poems> poems, Context context) {
        this.poems = poems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poem_item, parent, false);
        PoemsAdapter.ViewHolder viewHolder = new PoemsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).poemImageView.setImageResource(poems.get(position).getPoemImg());
        ((ViewHolder) holder).poemTextView.setText(poems.get(position).getPoemName());
    }

    @Override
    public int getItemCount() {
        return poems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView poemImageView;
        public TextView poemTextView;
        public View view;

        public ViewHolder(@androidx.annotation.NonNull View itemView) {
            super(itemView);
            view = itemView;
            poemImageView = itemView.findViewById(R.id.poemImageView);
            poemTextView  = itemView.findViewById(R.id.poemText);
        }
    }
}
