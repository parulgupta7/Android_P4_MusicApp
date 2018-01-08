package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView songName = (TextView) findViewById(R.id.song);
        TextView AlbumName = (TextView) findViewById(R.id.album);
        ImageView imageAddress = (ImageView) findViewById(R.id.art);
        TextView ArtistName = (TextView) findViewById(R.id.artist);


        songName.setText(getIntent().getStringExtra("Song_Name"));
        ArtistName.setText(getIntent().getStringExtra("Artist_Name"));
        imageAddress.setImageResource(getIntent().getIntExtra("Image_Number", 0));
        AlbumName.setText(getIntent().getStringExtra("Album_name"));

        Button back = (Button) findViewById(R.id.button_1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlaying.this, Library.class);
                startActivity(i);
            }
        });

    }
}
