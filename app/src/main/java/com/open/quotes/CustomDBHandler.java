package com.open.quotes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomDBHandler extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "quotesdb";

    private static final String TABLE_QUOTES = "quotes";
    private static final String KEY_ID = "id";
    private static final String KEY_QUOTES = "quotes";
    private static final String KEY_LANG = "language";
    private static final String KEY_FAVORITE = "favorite";

    public CustomDBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public void loadInitialData(){
        //Get the Data Repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
        //Create a new map of values, where column names are the keys
        ContentValues cValues = new ContentValues();
        cValues.put(KEY_ID, 1);
        cValues.put(KEY_QUOTES, "Helloooooo World...");
        cValues.put(KEY_LANG, "en");
        cValues.put(KEY_FAVORITE, 0);
        // Insert the new row, returning the primary key value of the new row
        try{
            long newRowId = db.insert(TABLE_QUOTES,null, cValues);
            System.out.println("newRowId "+newRowId);
        }catch (Exception e){
            System.out.println("ERROR ");
        }

    }

    public void getData(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_QUOTES,
                new String[]{KEY_ID, KEY_QUOTES, KEY_LANG, KEY_FAVORITE}, KEY_ID+ "=?",
                new String[]{String.valueOf(1)}, null, null, null );

        List<QuoteData> quotesList = new ArrayList<>();
        while(cursor.moveToNext()){
            QuoteData q = new QuoteData();
            q.setId(cursor.getInt(cursor.getColumnIndex(KEY_ID)));
            q.setQuote(cursor.getString(cursor.getColumnIndex(KEY_QUOTES)));
            q.setLanguage(cursor.getString(cursor.getColumnIndex(KEY_LANG)));
            q.setFavorite((1 == cursor.getInt(cursor.getColumnIndex(KEY_FAVORITE))) ? true : false);
            System.out.println("Quote "+q);
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_QUOTES + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_QUOTES + " TEXT,"
                + KEY_LANG + " TEXT,"
                + KEY_FAVORITE + " INTEGER"+ ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if exist
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUOTES);
        // Create tables again
        onCreate(db);
    }
}
