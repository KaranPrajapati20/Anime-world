package com.example.animeworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class SlideVideoPlayer extends AppCompatActivity {

    VideoView slidevideoplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_video_player);

        slidevideoplayer = findViewById(R.id.slidevideoView);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }


        try{
            Intent intent = getIntent();
            String videourl = intent.getStringExtra("slide1");
            slidevideoplayer.setVideoURI(Uri.parse(videourl));
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(slidevideoplayer);
            mediaController.setMediaPlayer(slidevideoplayer);
            slidevideoplayer.setMediaController(mediaController);
            slidevideoplayer.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            Intent intent = getIntent();
            String videourl = intent.getStringExtra("slide2");
            slidevideoplayer.setVideoURI(Uri.parse(videourl));
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(slidevideoplayer);
            mediaController.setMediaPlayer(slidevideoplayer);
            slidevideoplayer.setMediaController(mediaController);
            slidevideoplayer.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            Intent intent = getIntent();
            String videourl = intent.getStringExtra("slide3");
            slidevideoplayer.setVideoURI(Uri.parse(videourl));
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(slidevideoplayer);
            mediaController.setMediaPlayer(slidevideoplayer);
            slidevideoplayer.setMediaController(mediaController);
            slidevideoplayer.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}