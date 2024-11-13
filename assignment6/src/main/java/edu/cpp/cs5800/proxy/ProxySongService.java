package edu.cpp.cs5800.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.cpp.cs5800.proxy.Util.log;

public class ProxySongService implements SongService {
    private final SongService songService = new RealSongService();
    private final Map<Integer, Song> cacheById = new HashMap<>();
    private final Map<String, List<Song>> cacheByTitle = new HashMap<>();
    private final Map<String, List<Song>> cacheByAlbum = new HashMap<>();

    @Override
    public Song searchById(Integer songId) {
        log("ProxySongService.searchById: " + songId);
        if (cacheById.containsKey(songId)) {
            return cacheById.get(songId);
        }

        Song song = songService.searchById(songId);
        if (song != null) {
            cacheById.put(songId, song);
        }

        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        log("ProxySongService.searchByTitle: " + title);
        if (cacheByTitle.containsKey(title)) {
            return cacheByTitle.get(title);
        }

        List<Song> songs = songService.searchByTitle(title);
        if (!songs.isEmpty()) {
            cacheByTitle.put(title, songs);
        }

        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        log("ProxySongService.searchByAlbum: " + album);
        if (cacheByAlbum.containsKey(album)) {
            return cacheByAlbum.get(album);
        }

        List<Song> songs = songService.searchByAlbum(album);
        if (!songs.isEmpty()) {
            cacheByAlbum.put(album, songs);
        }

        return songs;
    }
}
