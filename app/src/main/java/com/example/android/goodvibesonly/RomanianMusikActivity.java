package com.example.android.goodvibesonly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanianMusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<MusicContent> music = new ArrayList<>();

        music.add(new MusicContent("3 Sud Est", "Cine Esti?", "watch?v=VQ0xFmP0mtY", R.drawable.sud));
        music.add(new MusicContent("Delia", "Cine m-a facut om mare", "watch?v=3Kw8OUzVyEU", R.drawable.delia));
        music.add(new MusicContent("Edward Sanda", "Doar pe a ta", "watch?v=FhlBnFehhNo", R.drawable.edward));
        music.add(new MusicContent("Lidia Buble", "Mi-e bine", "watch?v=SCL1W7YUKCI", R.drawable.lidia));
        music.add(new MusicContent("Randi", "Ochii ăia verzi", "watch?v=xFJ42NKsezo", R.drawable.randi));

        MusicContentAdapter myAdapter = new MusicContentAdapter(this, music);

        ListView listView = findViewById(R.id.general_item);

        listView.setAdapter(myAdapter);

    }
}
