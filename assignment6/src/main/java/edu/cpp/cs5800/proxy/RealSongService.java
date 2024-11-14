package edu.cpp.cs5800.proxy;

import java.util.ArrayList;
import java.util.List;

import static edu.cpp.cs5800.proxy.Util.log;

public class RealSongService implements SongService {
    private final List<Song> allSongs = new ArrayList<>();

    public RealSongService() {
        initialSongs();
    }

    @Override
    public Song searchById(Integer id) {
        this.delay();
        log("RealSongService.searchById: " + id);
        for (Song song : allSongs) {
            if (song.getId().equals(id)) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        this.delay();
        log("RealSongService.searchByTitle: " + title);
        List<Song> songs = new ArrayList<>();
        for (Song song : allSongs) {
            if (song.getTitle().equals(title)) {
                songs.add(song);
            }
        }
        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        this.delay();
        log("RealSongService.searchByAlbum: " + album);
        List<Song> songs = new ArrayList<>();
        for (Song song : allSongs) {
            if (song.getAlbum().equals(album)) {
                songs.add(song);
            }
        }
        return songs;
    }

    private void initialSongs() {
        allSongs.add(new Song("Shape of You", "Ed Sheeran", "Divide", 240));
        allSongs.add(new Song("Blinding Lights", "The Weeknd", "After Hours", 200));
        allSongs.add(new Song("Levitating", "Dua Lipa", "Future Nostalgia", 203));
        allSongs.add(new Song("Someone Like You", "Adele", "TwentyOne", 285));
        allSongs.add(new Song("Thinking Out Loud", "Ed Sheeran", "Multiply", 281));
        allSongs.add(new Song("Rockstar", "Post Malone", "Beerbongs & Bentleys", 218));
        allSongs.add(new Song("Havana", "Camila Cabello", "Camila", 217));
        allSongs.add(new Song("Uptown Funk", "Mark Ronson", "Uptown Special", 269));
        allSongs.add(new Song("Rolling in the Deep", "Adele", "TwentyOne", 228));
        allSongs.add(new Song("Sunflower", "Post Malone", "Hollywood's Bleeding", 158));
    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
