package com.example.yls.demoa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.v1);
        videoView.setVideoPath("/mnt/shared/Other/family.mp4");
        videoView.setMediaController(new MediaController(MainActivity.this));
        videoView.start();
    }
}
