package edu.cpp.cs5800;

public class Formatter {
    public static String format(String name, double price) {
        int totalWidth = 25;
        String strPrice = String.format("%.2f", price);

        int dashCount = totalWidth - name.length() - strPrice.length();
        String fill = new String(new char[dashCount]).replace("\0", " ");

        return name + fill + strPrice + "\n";
    }
}
