package edu.cpp.cs5800.proxy;

public class Song {
    private static int incrementId = 1;
    private final Integer id;
    private final String title;
    private final String artist;
    private final String album;
    private final int duration;

    public Song(String title, String artist, String album, int duration) {
        this.id = incrementId++;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("Song(%d, %s, %s, %s, %d)", id, title, artist, album, duration);
    }
}
