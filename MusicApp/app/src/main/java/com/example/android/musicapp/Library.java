package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    ArrayList<SongFiles> songs = new ArrayList<SongFiles>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        songs.add(new SongFiles(getString(R.string.song_1_name), getString(R.string.song_1_album), getString(R.string.song_1_artist), R.mipmap.despacito));
        songs.add(new SongFiles(getString(R.string.song_2_name), getString(R.string.song_2_album), getString(R.string.song_2_artist), R.mipmap.hostel));
        songs.add(new SongFiles(getString(R.string.song_3_name), getString(R.string.song_3_album), getString(R.string.song_3_artist), R.mipmap.perfect));
        songs.add(new SongFiles(getString(R.string.song_4_name), getString(R.string.song_4_album), getString(R.string.song_4_artist), R.mipmap.gangland));
        songs.add(new SongFiles(getString(R.string.song_5_name), getString(R.string.song_5_album), getString(R.string.song_5_artist), R.mipmap.tnwm));
        songs.add(new SongFiles(getString(R.string.song_6_name), getString(R.string.song_6_album), getString(R.string.song_6_artist), R.mipmap.edsheeran));
        songs.add(new SongFiles(getString(R.string.song_7_name), getString(R.string.song_7_album), getString(R.string.song_7_artist), R.mipmap.pyaar));
        songs.add(new SongFiles(getString(R.string.song_8_name), getString(R.string.song_8_album), getString(R.string.song_8_artist), R.mipmap.angrej));
        songs.add(new SongFiles(getString(R.string.song_9_name), getString(R.string.song_9_album), getString(R.string.song_9_artist), R.mipmap.glorious));
        songs.add(new SongFiles(getString(R.string.song_10_name), getString(R.string.song_10_album), getString(R.string.song_10_artist), R.mipmap.speedysinghs));


        ListView l_view = (ListView) findViewById(R.id.gaane);
        CustomSongsAdapter adapter = new CustomSongsAdapter(this, songs);
        l_view.setAdapter(adapter);


        l_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Library.this, NowPlaying.class);
                intent.putExtra("Song_Name", songs.get(position).getName());
                intent.putExtra("Artist_Name", songs.get(position).getArtist());
                intent.putExtra("Image_Number", songs.get(position).getImage());
                intent.putExtra("Album_name", songs.get(position).getAlbum());
                startActivity(intent);
            }
        });


    }


}
