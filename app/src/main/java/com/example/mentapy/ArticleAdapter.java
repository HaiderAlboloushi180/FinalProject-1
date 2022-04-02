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

import com.squareup.picasso.Picasso;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    List<Article> articles;

    public ArticleAdapter(@NonNull Context context, int resource, @NonNull List<Article> objects) {
        super(context, resource, objects);
        this.articles = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.articles_list_item, parent, false);

        Article currentArticle = articles.get(position);

        TextView articleTitle = view.findViewById(R.id.articleTitle);
        articleTitle.setText(currentArticle.getArticleTitle());

        ImageView articleImage = view.findViewById(R.id.articleImg);
        Picasso.with(getContext()).load(currentArticle.getArticleImgURL()).into(articleImage);

        return view;
    }
}
