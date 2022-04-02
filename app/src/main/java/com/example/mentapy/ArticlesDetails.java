package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArticlesDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_details);

        // Java Air
        Bundle bundle = getIntent().getExtras();
        final Article selectedArticle = (Article) bundle.getSerializable("ARTICLES");

        // VIIIEWWWSS
        TextView articleTitleTextView = findViewById(R.id.articleDetailsTitle);
        TextView articleDescrTextView = findViewById(R.id.articleDetailsDesc);
        Button visitButton = findViewById(R.id.articleButton);

        articleTitleTextView.setText(selectedArticle.getArticleTitle());
        articleDescrTextView.setText(selectedArticle.getArticleDesc());

        // VISIT THE LINK
        visitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = selectedArticle.getArticleLink();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}