package edu.cpp.cs5800.chatapp;

import java.util.Iterator;
import java.util.List;

public class ChatIterator implements Iterator<Message> {
    private List<Message> messages;
    private int currentIndex;

    public ChatIterator(List<Message> userMessages) {
        this.messages = userMessages;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.messages.size() > this.currentIndex;
    }

    @Override
    public Message next() {
        return this.messages.get(this.currentIndex++);
    }
}
