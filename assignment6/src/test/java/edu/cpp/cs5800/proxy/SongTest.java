package edu.cpp.cs5800.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {
    Song song = new Song("Blinding Lights", "The Weeknd", "After Hours", 200);

    @Test
    public void testGetTitle() {
        assertEquals("Blinding Lights", song.getTitle());
    }

    @Test
    public void testGetArtist() {
        assertEquals("The Weeknd", song.getArtist());
    }

    @Test
    public void testGetAlbum() {
        assertEquals("After Hours", song.getAlbum());
    }

    @Test
    public void testGetDuration() {
        assertEquals(200, song.getDuration());
    }
}
