package com.open.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView quoteview;
    private FloatingActionButton reload;
    private FloatingActionButton share;
    private FloatingActionButton markFavorite;
    private FloatingActionButton settings;

    QuotesService quotesService = new QuotesService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;

        quoteview = findViewById(R.id.quoteView);
        reload = findViewById(R.id.reload);
        share = findViewById(R.id.share);
        markFavorite = findViewById(R.id.markFavorite);
        settings = findViewById(R.id.settings);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String theme = preferences.getString("theme", "light");
        boolean enableNotifications = preferences.getBoolean("enableNotifications", true);

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
                Intent shareIntent = new Intent();
                shareIntent.setAction("android.intent.action.SEND");
                StringBuilder textString = new StringBuilder();
                TextView textView = MainActivity.this.quoteview;
                String text = textString.append(String.valueOf(textView != null ? textView.getText() : null)).append("\n\n~Buddha").toString();
                shareIntent.putExtra("android.intent.extra.TEXT", text);
                shareIntent.setType("text/plain");
                shareIntent = Intent.createChooser(shareIntent, (CharSequence)null);
                MainActivity.this.startActivity(shareIntent);
            }
        });

        markFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do my thing
            }
        });

        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Do my thing
                Intent intent = new Intent(context, SettingsActivity.class);
                context.startActivity(intent);
            }
        });

        //CustomDBHandler dbHandler = new CustomDBHandler(this);
        //dbHandler.loadInitialData();
        //dbHandler.getData();
    }
}