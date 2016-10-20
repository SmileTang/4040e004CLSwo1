package com.example.a4040e004wo.a4040e004wo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoo);
        VideoView videoView = (VideoView) this.findViewById(R.id.vvvdd);
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bbbbrr));
        videoView.requestFocus();
        videoView.start();

    }

    public void rett(View view) {
        Intent intent =new Intent();
        intent.setClass(videoo.this, MainActivity.class);
        startActivity(intent);
    }
}
