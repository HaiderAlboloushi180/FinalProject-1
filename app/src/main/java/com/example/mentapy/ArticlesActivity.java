package com.example.mentapy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArticlesActivity extends AppCompatActivity {

    ArrayList<Article> articles;
    ListView articlesListView;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        articles = new ArrayList<>();
        articlesListView = findViewById(R.id.articlesList);
        db = FirebaseFirestore.getInstance();
        loadDataIntoView();
    }

    private void loadDataIntoView() {
        db.collection("Articles").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        if (!queryDocumentSnapshots.isEmpty()) {
                            List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                            for (DocumentSnapshot d : list) {
                                Article article = d.toObject(Article.class);
                                articles.add(article);
                            }

                            ArticleAdapter adapter = new ArticleAdapter(ArticlesActivity.this, 0, articles);
                            articlesListView.setAdapter(adapter);

                        } else {
                            Toast.makeText(ArticlesActivity.this, "No data found in Database", Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ArticlesActivity.this, "Fail to load data..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}