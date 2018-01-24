package com.example.android.goodvibesonly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HitsMusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<MusicContent> music = new ArrayList<>();

        music.add(new MusicContent("Luis Fonsi", "Échame La Culpa", "watch?v=TyHvyGVs42U", R.drawable.fonsi));
        music.add(new MusicContent("LP", "When We're High", "watch?v=lfkgOWrd1vc", R.drawable.lp));
        music.add(new MusicContent("Pink", "What About Us", "watch?v=ClU3fctbGls", R.drawable.pink));
        music.add(new MusicContent("Ed Sheeran", "Perfect ", "watch?v=2Vv-BfVoq4g", R.drawable.ed));
        music.add(new MusicContent("ZYAN", "Dusk Till Dawn", "watch?v=tt2k8PGm-TI", R.drawable.zyan));

        MusicContentAdapter myAdapter = new MusicContentAdapter(this, music);

        ListView listView = findViewById(R.id.general_item);

        listView.setAdapter(myAdapter);
    }
}
