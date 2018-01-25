package com.example.android.goodvibesonly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView healingIcon = findViewById(R.id.healing_icon);
        healingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHealingIcon = new Intent(MainActivity.this, HealingMusikActivity.class);
                startActivity(intentHealingIcon);
            }
        });


        TextView healingText = findViewById(R.id.healing_text_view);
        healingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHealingText = new Intent(MainActivity.this, HealingMusikActivity.class);
                startActivity(intentHealingText);
            }
        });

        ImageView hitsIcon = findViewById(R.id.hits_icon);
        hitsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHitsIcon = new Intent(MainActivity.this, HitsMusikActivity.class);
                startActivity(intentHitsIcon);
            }
        });

        TextView hitsTextView = findViewById(R.id.hits_text_view);
        hitsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHitsText = new Intent(MainActivity.this, HitsMusikActivity.class);
                startActivity(intentHitsText);
            }
        });

        ImageView romanianIcon = findViewById(R.id.icon_romanian);
        romanianIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRomanianIcon = new Intent(MainActivity.this, RomanianMusikActivity.class);
                startActivity(intentRomanianIcon);
            }
        });

        TextView romanianTextView = findViewById(R.id.romanian_text_view);
        romanianTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRomanianText = new Intent(MainActivity.this, RomanianMusikActivity.class);
                startActivity(intentRomanianText);
            }
        });

        ImageView partyIcon = findViewById(R.id.icon_party);
        partyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPartyIcon = new Intent(MainActivity.this, PartyMusikActivity.class);
                startActivity(intentPartyIcon);
            }
        });

        TextView partyTextView = findViewById(R.id.party_text_view);
        partyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPartyText = new Intent(MainActivity.this, PartyMusikActivity.class);
                startActivity(intentPartyText);
            }
        });

        ImageView podcastIcon = findViewById(R.id.image_podcast);
        podcastIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPodcastIcon = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(intentPodcastIcon);
            }
        });

        TextView podcastTextView = findViewById(R.id.podcast_text_view);
        podcastTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPodcastText = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(intentPodcastText);
            }
        });
    }
}
