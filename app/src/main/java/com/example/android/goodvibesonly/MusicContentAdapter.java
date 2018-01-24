package com.example.android.goodvibesonly;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Noemi on 1/24/2018.
 */

public class MusicContentAdapter extends ArrayAdapter<MusicContent> {

    public MusicContentAdapter(Context context, ArrayList<MusicContent> music){
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.general, parent, false);
        }
        MusicContent musicContent = getItem(position);

        ImageView myImage = listItemView.findViewById(R.id.general_image);
        myImage.setImageResource(musicContent.getPhotoId());

        TextView myStar = listItemView.findViewById(R.id.textview1);
        myStar.setText(musicContent.getNameId());

        TextView mySong = listItemView.findViewById(R.id.textview2);
        mySong.setText(musicContent.getSongId());

        final TextView myLink = listItemView.findViewById(R.id.textview3);
        myLink.setText(musicContent.getLinkId());
        myLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView myLink = v.findViewById(R.id.textview3);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/" + myLink.getText()));
                if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(intent);
                }

            }
        });

        return listItemView;
    }
}
