package edu.cpp.quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book {

    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookDeepCopy clone() {
        List<String> chapters = new ArrayList<>(getChapters());
        return new BookDeepCopy(getTitle(), getAuthor(), chapters);
    }
}
