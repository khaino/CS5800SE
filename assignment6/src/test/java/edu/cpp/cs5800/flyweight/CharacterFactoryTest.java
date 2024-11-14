package edu.cpp.cs5800.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterFactoryTest {
    @Test
    public void testGetCharacter() {
        String expected = "B(ARIAL,RED,12)";
        Character actual = CharacterFactory.getCharacter('B', CharacterFormat.Font.ARIAL, CharacterFormat.Color.RED, 12);

        assertEquals(expected, actual.toString());
    }
}
