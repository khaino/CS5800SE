package edu.cpp.cs5800.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, CharacterFormat> formats = new HashMap<>();

    public static Character getCharacter(char symbol, CharacterFormat.Font font, CharacterFormat.Color color, int fontSize) {
        String formatType = font.toString() + color.toString() + fontSize;
        CharacterFormat format = formats.get(formatType);
        if (format == null) {
            format = new CharacterFormat(color, font, fontSize);
        }

        return new Character(symbol, format);
    }
}
