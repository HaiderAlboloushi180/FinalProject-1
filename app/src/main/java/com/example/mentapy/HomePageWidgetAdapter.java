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

import java.util.List;

public class HomePageWidgetAdapter extends ArrayAdapter<HomePageWidget> {

    List<HomePageWidget> widgetItems;

    public HomePageWidgetAdapter(@NonNull Context context, int resource, @NonNull List<HomePageWidget> objects) {
        super(context, resource, objects);
        this.widgetItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        HomePageWidget currentWidget = widgetItems.get(position);

        TextView widgetText = view.findViewById(R.id.widgetText);
        ImageView widgetImg = view.findViewById(R.id.widgetImg);

        widgetText.setText(currentWidget.getWidgetText());
        widgetImg.setImageResource(currentWidget.getWidgetImg());

        return view;
    }
}
