package edu.cpp.cs5800.chatapp;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class User {
    private static int idIncrement = 0;
    private final int id;
    private final String username;
    private final ChatServer chatServer;
    private Message.Memento memento;

    public User(String username, ChatServer chatServer) {
        this.id = ++idIncrement;
        this.username = username;
        this.chatServer = chatServer;
    }

    public String getUsername() {
        return username;
    }

    public int sendMessage(String content, List<User> recipients) {
        Message message = new Message(content, recipients, this);
        this.memento = message.takeSnapshot();
        return this.chatServer.sendMessage(message);
    }

    public void receiveMessage(Message message) {
        System.out.println(getUsername() + " received message: `" + message.getContent() + "` from " + message.getSender()
                .getUsername());
    }

    public boolean undoLastMessage() {
        if (memento == null) {
            System.out.println(getUsername() + " has no message to undo.");
            return false;
        } else {
            Message message = Message.restoreSnapshot(memento);
            return this.chatServer.unsendMessage(message);
        }
    }

    public String getLastMessage() {
        Message message = this.chatServer.getLastMessage(this);
        return String.format("%s sent to %s: %s", getUsername(), message.getRecipients(), message.getContent());
    }

    public Iterator<Message> getChatIterator() {
        return this.chatServer.getChatIterator(this);
    }

    public boolean blockUser(User user) {
        return this.chatServer.blockUser(this, user);
    }

    public boolean unblockUser(User user) {
        return this.chatServer.unblockUser(this, user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

    @Override
    public String toString() {
        return username;
    }
}
