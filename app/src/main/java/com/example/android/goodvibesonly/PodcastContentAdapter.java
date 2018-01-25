package com.example.android.goodvibesonly;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Noemi on 1/25/2018.
 */

public class PodcastContentAdapter extends ArrayAdapter<PodcastContent> {

    public PodcastContentAdapter(Context context, ArrayList<PodcastContent> podcast){
        super(context, 0, podcast);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_podcast, parent, false);
        }

        PodcastContent content = getItem(position);

        TextView textViewName = listItemView.findViewById(R.id.textview_fonsi);
        textViewName.setText(content.getName());

        TextView textViewSong = listItemView.findViewById(R.id.textview_culpa);
        textViewSong.setText(content.getSong());

        return listItemView;
    }
}
