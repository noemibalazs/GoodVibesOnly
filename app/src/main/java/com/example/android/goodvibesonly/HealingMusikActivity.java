package com.example.android.goodvibesonly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class HealingMusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        Button button = findViewById(R.id.general_list_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealingMusikActivity.this, HitsMusikActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<MusicContent> music = new ArrayList<>();
        music.add(new MusicContent("Solfeggio", "Miracle Meditation", "watch?v=tZrBRQn6K0A", R.drawable.heart));
        music.add(new MusicContent("Solfeggio", "Pineal Gland Activation", "watch?v=3h2mJnvRbZ8", R.drawable.eye));
        music.add(new MusicContent("Solfeggio", "Awakening Intuition", "watch?v=hhHe8C6Qej4", R.drawable.dopamin));
        music.add(new MusicContent("Happiness", "Relaxing Music", "watch?v=LFGsZ6ythQQ", R.drawable.happiness));
        music.add(new MusicContent("Happiness", "Endorphin Release Music", "watch?v=zvEX3Aniyxo", R.drawable.solfeggio));

        MusicContentAdapter myAdapter = new MusicContentAdapter(this, music);

        ListView listView = findViewById(R.id.general_item);

        listView.setAdapter(myAdapter);
    }
}
