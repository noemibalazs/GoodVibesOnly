package com.example.android.goodvibesonly;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    private AudioManager mAudioManager;

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);}
            else if (focusChange == AudioManager.AUDIOFOCUS_GAIN){
                mMediaPlayer.start();}
            else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                releaseMediaPlayer();
            }


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<PodcastContent> podcast = new ArrayList<>();

        podcast.add(new PodcastContent("Luis Fonsi", "Echame la Culpa", R.raw.culpa));
        podcast.add(new PodcastContent("LP", "When We're high", R.raw.high));
        podcast.add(new PodcastContent("Pink", "What About Us", R.raw.about));
        podcast.add(new PodcastContent("Ed Sheeran", "Perfect", R.raw.perfect));
        podcast.add(new PodcastContent("ZYAN", "Dusk Till Dawn", R.raw.dusk));
        podcast.add(new PodcastContent("Rita Ora", "Anywhere", R.raw.anywhere));
        podcast.add(new PodcastContent("Black Eyed Peas", "Shut Up", R.raw.shut));
        podcast.add(new PodcastContent("Enrique Iglesias", "Bailando", R.raw.bailando));
        podcast.add(new PodcastContent("Geeno Smith", "Stand By Me", R.raw.stand));
        podcast.add(new PodcastContent("Jenifer Lopez", "On The Floor", R.raw.floor));
        podcast.add(new PodcastContent("The Pussycat Dolls", "Don't Cha", R.raw.cha));
        podcast.add(new PodcastContent("3 Sud Est", "Cine esti?", R.raw.cine));
        podcast.add(new PodcastContent("Delia", "Cine m-a facut om mare", R.raw.om));
        podcast.add(new PodcastContent("Edward Sanda", "Doar pe a Ta", R.raw.doar));
        podcast.add(new PodcastContent("Lidia Buble", "Mi-e bine", R.raw.bine));
        podcast.add(new PodcastContent("Randi", "Ochii aia verzi", R.raw.ochii));
        podcast.add(new PodcastContent("Solfeggio Harmonics", "Miracle Meditation", R.raw.meditation));
        podcast.add(new PodcastContent("Solfeggio Harmonics", "Pineal Gland Activation", R.raw.gland));
        podcast.add(new PodcastContent("Solfeggio Harmonics", "Awakening Intuition", R.raw.intuition));

        final PodcastContentAdapter myAdapter = new PodcastContentAdapter(this, podcast);

        ListView listView = findViewById(R.id.general_item);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();

                PodcastContent content = podcast.get(position);

                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){

                    mMediaPlayer = MediaPlayer.create(PodcastActivity.this, content.getRaw());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(onCompletionListener);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if (mMediaPlayer != null){
            mMediaPlayer.release();
            mMediaPlayer=null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
