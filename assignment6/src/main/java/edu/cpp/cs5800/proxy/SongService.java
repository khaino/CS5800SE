package edu.cpp.cs5800.proxy;

import java.util.List;

public interface SongService {
    Song searchById(Integer songId);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}
