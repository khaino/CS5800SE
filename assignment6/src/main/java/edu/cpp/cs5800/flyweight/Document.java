package edu.cpp.cs5800.flyweight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Character> characters = new ArrayList<>();

    public boolean load(String path) {
        characters.clear();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                Character ch = parseCharacter(line);
                if (ch != null) {
                    this.addCharacter(ch);
                }
            }
        } catch (IOException e) {
            return false;
        }

        return true;
    }

    public boolean addCharacter(char symbol,
                                CharacterFormat.Font font,
                                CharacterFormat.Color color,
                                int size) {
        Character ch = CharacterFactory.getCharacter(symbol, font, color, size);
        return characters.add(ch);
    }

    public boolean addCharacter(Character character) {
        return characters.add(character);
    }

    public Character edit(int index,
                          char symbol,
                          CharacterFormat.Font font,
                          CharacterFormat.Color color,
                          int size) {
        Character ch = CharacterFactory.getCharacter(symbol, font, color, size);
        return characters.set(index, ch);
    }

    public boolean save(String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Character character : characters) {
                writer.write(character.getSymbol() + "," + character.getFormat()
                        .getFont() + "," + character.getFormat()
                        .getColor() + "," + character.getFormat().getFontSize());
                writer.newLine();
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public String getContent() {
        StringBuilder content = new StringBuilder();
        for (Character character : characters) {
            content.append(character);
            content.append('\n');
        }
        return content.toString();
    }

    private Character parseCharacter(String content) {
        String[] parts = content.split(",");
        if (parts.length == 4) {
            char symbol = parts[0].charAt(0);
            CharacterFormat.Font font = CharacterFormat.Font.valueOf(parts[1]);
            CharacterFormat.Color color = CharacterFormat.Color.valueOf(parts[2]);
            int size = Integer.parseInt(parts[3]);
            return CharacterFactory.getCharacter(symbol, font, color, size);
        } else {
            return null;
        }
    }
}
