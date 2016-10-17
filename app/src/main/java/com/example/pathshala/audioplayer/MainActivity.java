package com.example.pathshala.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playAudioBtn;
    Button pauseAudioBtn;
    Button resetAudioBtn;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playAudioBtn = (Button) findViewById(R.id.play_audio_btn);
        pauseAudioBtn = (Button) findViewById(R.id.pause_audio_btn);
        resetAudioBtn = (Button) findViewById(R.id.reset_audio_btn);
        mediaPlayer = MediaPlayer.create(this, R.raw.song  );

        playAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        pauseAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        resetAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.reset();
            }
        });
    }
}
