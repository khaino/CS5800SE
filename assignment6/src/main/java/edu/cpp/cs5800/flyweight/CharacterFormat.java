package edu.cpp.cs5800.flyweight;

public class CharacterFormat {
    public enum Color {
        RED, BLACK, BLUE
    }

    public enum Font {
        ARIAL, CALIBRI, VERDANA
    }

    private final Color color;
    private final Font font;
    private final int fontSize;

    public CharacterFormat(Color color, Font font, int fontSize) {
        this.color = color;
        this.font = font;
        this.fontSize = fontSize;
    }

    public Color getColor() {
        return color;
    }

    public Font getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public String toString() {
        return font + "," + color + "," + fontSize;
    }
}
