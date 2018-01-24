package com.example.android.goodvibesonly;

/**
 * Created by Noemi on 1/24/2018.
 */

public class MusicContent {
    private String mNameId;

    private String mSongId;

    private String mLinkId;

    private int mPhotoId;

    public MusicContent(String nameId, String songId, String linkId, int photoId){
        mNameId = nameId;
        mSongId = songId;
        mLinkId = linkId;
        mPhotoId = photoId;
    }

    public String getNameId(){
        return mNameId;
    }

    public String getSongId(){
        return mSongId;
    }

    public String getLinkId(){
        return mLinkId;
    }

    public int getPhotoId(){
        return mPhotoId;
    }
}
