package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Parul on 12/24/2017.
 */

public class CustomSongsAdapter extends ArrayAdapter<SongFiles> {

    public CustomSongsAdapter(Activity context, ArrayList<SongFiles> songs) {
        super(context, 0, songs);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View ItemView = convertView;

        if (ItemView == null) {
            ItemView = LayoutInflater.from(getContext()).inflate(R.layout.library_page, parent, false);
        }

        SongFiles song = getItem(position);

        ImageView imageView = (ImageView) ItemView.findViewById(R.id.album_art);
        imageView.setImageResource(song.getImage());

        TextView songName = (TextView) ItemView.findViewById(R.id.song_name);
        songName.setText(song.getName());

        TextView albumName = (TextView) ItemView.findViewById(R.id.album_name);
        albumName.setText(song.getAlbum());

        TextView artistName = (TextView) ItemView.findViewById(R.id.artist_name);
        artistName.setText(song.getArtist());

        return ItemView;
    }
}
