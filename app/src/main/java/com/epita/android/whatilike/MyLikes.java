package com.epita.android.whatilike;

/**
 * Created by Junaid KHALID on 10/20/2016.
 */

public class MyLikes {
    private String sMovie;
    private boolean bIsGoodGuy;


    public MyLikes(String sMovie, boolean bIsGoodGuy) {
        this.bIsGoodGuy = bIsGoodGuy;
        this.sMovie = sMovie;
    }

    public String getsMovie() {
        return sMovie;
    }

    public boolean isbIsGoodGuy() {
        return bIsGoodGuy;
    }

}
