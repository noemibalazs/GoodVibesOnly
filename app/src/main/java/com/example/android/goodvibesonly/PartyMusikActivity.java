package com.example.android.goodvibesonly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PartyMusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<MusicContent> music = new ArrayList<>();
        music.add(new MusicContent("Black Eyed Peas", "Shut Up", "watch?v=KRzMtlZjXpU", R.drawable.black));
        music.add(new MusicContent("Enrique Iglesias", "Bailando", "watch?v=NUsoVlDFqZg", R.drawable.enrique));
        music.add(new MusicContent("Geeno Smith", "Stand By Me", "watch?v=vG0rKmfUQvk", R.drawable.geeno));
        music.add(new MusicContent("Jennifer Lopez", "On The Floor", "watch?v=t4H_Zoh7G5A", R.drawable.jlo));
        music.add(new MusicContent("The Pussycat Dolls", "Don't Cha", "watch?v=YNSxNsr4wmA", R.drawable.pussycat));

        MusicContentAdapter myAdapter = new MusicContentAdapter(this, music);

        ListView listView = findViewById(R.id.general_item);

        listView.setAdapter(myAdapter);
    }
}
