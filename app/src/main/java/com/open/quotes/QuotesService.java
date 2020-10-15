package com.open.quotes;

public class QuotesService {

    public String getRandomQuote(){
        double randomVal = Math.random();
        long round = Math.round(randomVal * 1000);
        int randomQuoteNumber = (int) (round % 100);
        return String.valueOf(randomQuoteNumber);
    }
}
