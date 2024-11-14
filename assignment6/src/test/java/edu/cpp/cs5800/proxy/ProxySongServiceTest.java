package edu.cpp.cs5800.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxySongServiceTest {
    private SongService songService = new ProxySongService();

    @BeforeEach
    void setup() {
        Song.incrementId = 1;
        songService = new RealSongService();
    }

    @Test
    public void testSearchById() {
        String expected = "Song(2, Blinding Lights, The Weeknd, After Hours, 200)";
        assertEquals(expected, songService.searchById(2).toString());
    }

    @Test
    public void testSearchByTitle() {
        String expected = "[Song(6, Rockstar, Post Malone, Beerbongs & Bentleys, 218)]";
        assertEquals(expected, songService.searchByTitle("Rockstar").toString());
    }

    @Test
    public void testSearchByAlbum() {
        String expected = "[Song(1, Shape of You, Ed Sheeran, Divide, 240)]";
        assertEquals(expected, songService.searchByAlbum("Divide").toString());
    }
}
