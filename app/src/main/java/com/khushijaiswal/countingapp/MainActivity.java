package com.khushijaiswal.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    public void onLanguageClick(View view){
        Button buttonClicked=(Button) view;
        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier
                (buttonClicked.getTag().toString(),
                "raw",getPackageName()));
        mediaPlayer.start();
    }
    public void onStopClick(View view){
        if(mediaPlayer!=null) {
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}