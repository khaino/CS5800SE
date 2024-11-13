package edu.cpp.cs5800.flyweight;

public class Character {
    private final char symbol;
    private final CharacterFormat format;

    public Character(char symbol, CharacterFormat format) {
        this.symbol = symbol;
        this.format = format;
    }

    public char getSymbol() {
        return symbol;
    }
    public CharacterFormat getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return symbol + "(" + format + ")";
    }
}
