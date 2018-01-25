package com.example.android.goodvibesonly;

/**
 * Created by Noemi on 1/25/2018.
 */

public class PodcastContent {

    private String mName;

    private String mSong;

    private int mRaw;

    public PodcastContent(String song, String name, int raw){
        mSong = song;
        mName = name;
        mRaw = raw;
    }

    public String getName(){
        return mName;
    }

    public String getSong(){
        return mSong;
    }

    public int getRaw(){
        return mRaw;
    }
}
