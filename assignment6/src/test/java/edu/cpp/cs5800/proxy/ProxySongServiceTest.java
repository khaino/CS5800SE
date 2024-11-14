package edu.cpp.cs5800.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealSongServiceTest {
    private SongService realSongService = new RealSongService();

    @Test
    public void testSearchById() {
        String expected = "Song(2, Blinding Lights, The Weeknd, After Hours, 200)";
        assertEquals(expected, realSongService.searchById(2).toString());
    }

    @Test
    public void testSearchByTitle() {
        String expected = "[Song(6, Rockstar, Post Malone, Beerbongs & Bentleys, 218)]";
        assertEquals(expected, realSongService.searchByTitle("Rockstar").toString());
    }

    @Test
    public void testSearchByAlbum() {
        String expected = "[Song(1, Shape of You, Ed Sheeran, Divide, 240)]";
        assertEquals(expected, realSongService.searchByAlbum("Divide").toString());
    }
}
