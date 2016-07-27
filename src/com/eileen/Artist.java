package com.eileen;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album a) {
        this.albums.add(a);
    }

    public void deleteAlbum(String albumName) {
        Collection<Album> albumCollection = new ArrayList<>();
        albumCollection.removeIf((Album) a -> a.getName().equals(albumName));
//        Iterator<albums> albumIterator = new Iterator();
//        albumIterator.

    }

    public void deleteAlbum(Album a) {
        albums.remove(a);
    }
}
