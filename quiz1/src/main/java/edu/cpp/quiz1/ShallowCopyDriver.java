package edu.cpp.quiz1;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyDriver {
    public static void main(String[] args) {
        // Part 2) Create a book with BookShallowCopy and then create a clone of the book.
        // Modify the chapters of the original book only and show the outputs of both books
        System.out.println("==========Book Shallow Copy==========");
        List<String> shallowChapters = new ArrayList<>();
        shallowChapters.add("Introduction");
        shallowChapters.add("How to write a shallow Java program");
        BookShallowCopy originalShallow = new BookShallowCopy("Shallow Copy Book", "Mr John", shallowChapters);
        BookShallowCopy copyShallow = originalShallow.clone();
        System.out.println("Original: " + originalShallow);
        System.out.println("Copy:     " + copyShallow);

        System.out.println("------After modification of original--------");
        originalShallow.getChapters().add("How to run a shallow Java program");
        originalShallow.getChapters().set(0, "Introduction to shallow copy");
        System.out.println("Original: " + originalShallow);
        System.out.println("Copy:     " + copyShallow);
    }
}
