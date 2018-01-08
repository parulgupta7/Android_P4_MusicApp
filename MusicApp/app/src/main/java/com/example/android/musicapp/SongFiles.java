package com.example.android.musicapp;

/**
 * Created by Parul on 12/24/2017.
 */

public class SongFiles {
    private String name;
    private String album;
    private String artist;
    private int image;

    public SongFiles(String name, String album, String artist, int image) {

        this.album = album;
        this.name = name;
        this.artist = artist;
        this.image = image;

    }

    public String getName() {
        return this.name;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getImage() {
        return this.image;
    }
}
