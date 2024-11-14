package edu.cpp.quiz1;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyDriver {
    public static void main(String[] args) {
        // Part 3) Create a book with BookDeepCopy and then create a clone of the book.
        // Modify the chapters of the original book only and show the outputs of both books
        System.out.println("==========Book Deep Copy==========");
        List<String> deepChapters = new ArrayList<>();
        deepChapters.add("Introduction");
        deepChapters.add("How to write a deep Java program");
        BookDeepCopy originalDeep = new BookDeepCopy("Deep Copy Book", "Mr Peter", deepChapters);
        BookDeepCopy copyDeep = originalDeep.clone();
        System.out.println("Original: " + originalDeep);
        System.out.println("Copy:     " + copyDeep);

        System.out.println("------After modification of original--------");
        originalDeep.getChapters().add("How to run a deep Java program");
        originalDeep.getChapters().set(0, "Introduction to deep copy");
        System.out.println("Original: " + originalDeep);
        System.out.println("Copy:     " + copyDeep);
    }
}
