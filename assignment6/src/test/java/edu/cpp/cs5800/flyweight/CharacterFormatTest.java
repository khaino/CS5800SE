package edu.cpp.cs5800.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterFormatTest {
    @Test
    public void testGetSymbol() {
        Character ch = new Character('A', null);
        assertEquals(ch.getSymbol(), 'A');
    }

    @Test
    public void testToString() {
        Character ch = new Character('A', null);
        assertEquals("A(null)", ch.toString());
    }
}
