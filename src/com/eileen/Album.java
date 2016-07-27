package com.eileen;

import java.util.ArrayList;

public class Album implements Playable {
    private String name;
    private String genre;
    private String art;
    private ArrayList<Song> songs;

    public Album(String name, String genre, String art) {
        this.name = name;
        this.genre = genre;
        this.art = art;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public void addSong(Song s) {
        this.songs.add(s);
    }

    public void deleteSong(String songName) {

        for (Song song : this.songs) {
            if (song.getName().equals(songName)) {
                System.out.println("found it, removing: " + song.getName());
                this.songs.remove(song);
                break;
            }
        }
    }

    public void deleteSong(Song s) {
        this.songs.remove(s);
    }

    public int getAlbumDuration() {

        int time = 0;
        for (Song song : this.songs) {
            time += song.getDuration();
        }
        return time;

//        return this.songs.stream().map(s -> s.getDuration()).reduce(0, (sum, val) -> sum + val);
//        return songs.stream().reduce(0, (sum, val) -> sum + val);
    }

    @Override
    public void play() {
        System.out.println("album is playing");

    }
}
