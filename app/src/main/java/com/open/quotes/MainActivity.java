package com.open.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView quoteview;
    private FloatingActionButton reload;
    private FloatingActionButton share;
    private FloatingActionButton markFavorite;

    QuotesService quotesService = new QuotesService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteview = findViewById(R.id.quoteView);
        reload = findViewById(R.id.reload);
        share = findViewById(R.id.share);
        markFavorite = findViewById(R.id.markFavorite);

        quoteview.setText("Hello World ~ By Prabhu");

        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quoteview.setText("Quote "+quotesService.getRandomQuote()+" ~ By Prabhu");
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do my thing
            }
        });

        markFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do my thing
            }
        });

    }
}