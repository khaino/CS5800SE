package edu.cpp.cs5800.chatapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory implements IterableByUser {
    private List<Message> history = new ArrayList<>();

    public boolean addMessage(Message message) {
        return history.add(message);
    }

    public Message getLastMessage(User user) {
        return history
                .stream()
                .filter(message -> message.getSender().equals(user))
                .reduce((m1, m2) -> m2)
                .orElse(null);
    }

    public List<Message> getHistory(User user) {
        return history.stream()
                .filter(
                        message -> message.getSender().equals(user)
                                || message.getRecipients().contains(user)
                ).toList();
    }

    public boolean removeMessage(Message message) {
        return history.remove(message);
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new ChatIterator(getHistory(userToSearchWith));
    }
}
