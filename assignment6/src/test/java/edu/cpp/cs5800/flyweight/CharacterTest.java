package edu.cpp.cs5800.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    @Test
    public void testGetColor() {
        CharacterFormat format = new CharacterFormat(CharacterFormat.Font.CALIBRI,
                CharacterFormat.Color.BLACK, 12);
        assertEquals(CharacterFormat.Color.BLACK, format.getColor());
    }

    @Test
    public void testGetFont() {
        CharacterFormat format = new CharacterFormat(CharacterFormat.Font.CALIBRI,
                CharacterFormat.Color.BLACK, 12);
        assertEquals(CharacterFormat.Font.CALIBRI, format.getFont());
    }

    @Test
    public void testGetFontSize() {
        CharacterFormat format = new CharacterFormat(CharacterFormat.Font.CALIBRI,
                CharacterFormat.Color.BLACK, 12);
        assertEquals(12, format.getFontSize());
    }
}
