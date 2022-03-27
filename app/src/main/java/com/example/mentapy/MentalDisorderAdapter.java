package com.example.mentapy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class MentalDisorderAdapter extends ArrayAdapter<MentalDisorder> {

    List<MentalDisorder> disorders;

    public MentalDisorderAdapter(@NonNull Context context, int resource, @NonNull List<MentalDisorder> objects) {
        super(context, resource, objects);
        this.disorders = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.disorder_list_item, parent, false);

        MentalDisorder currentDisorder = disorders.get(position);

        TextView disorderText = view.findViewById(R.id.disorderTextView);
        disorderText.setText(currentDisorder.getDisorderName());

        ImageView disorderImg = view.findViewById(R.id.disorderImgView);
        disorderImg.setImageResource(currentDisorder.getDisorderImg());

        return view;
    }
}
