package com.eileen;

/**
 * Created by localadmin on 7/27/16.
 */
public class Song implements Playable {
    private String name;
    private String lyrics;
    private short duration;

    public Song(String name, String lyrics, short duration) {
        this.name = name;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public short getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("song " + this.name + " is playing for " + this.duration + " seconds");

    }
}
