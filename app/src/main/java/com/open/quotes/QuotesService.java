package com.open.quotes;

import android.content.Context;

public class QuotesService {

    public String getRandomQuote(){
        double randomVal = Math.random();
        long round = Math.round(randomVal * 1000);
        int randomQuoteNumber = (int) (round % 10);
        return String.valueOf(randomQuoteNumber);
    }
}
