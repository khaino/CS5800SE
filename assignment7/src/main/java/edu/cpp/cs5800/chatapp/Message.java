package edu.cpp.cs5800.chatapp;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Message {
    private static int idIncrement = 0;
    private int id;
    private String content;
    private List<User> recipients;
    private User sender;
    private Date timestamp;

    public Message(String content, List<User> recipients, User sender) {
        this.id = ++idIncrement;
        this.content = content;
        this.recipients = recipients;
        this.sender = sender;
        this.timestamp = new Date();
    }

    private Message(int id, String content, List<User> recipients, User sender, Date timestamp) {
        this.id = id;
        this.content = content;
        this.recipients = recipients;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public User getSender() {
        return sender;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Memento takeSnapshot() {
        return new Memento(this.getId(), this.getContent(), this.getRecipients(), this.getSender(), this.getTimestamp());
    }

    public static Message restoreSnapshot(Memento memento) {
        return new Message(memento.getId(), memento.getContent(), memento.getRecipients(), memento.getSender(), memento.getTimestamp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", recipients=" + recipients +
                ", sender=" + sender +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class Memento {
        private int id;
        private String content;
        private List<User> recipients;
        private User sender;
        private Date timestamp;

        public Memento(int id,
                              String content,
                              List<User> recipients,
                              User sender,
                              Date timestamp) {
            this.id = id;
            this.content = content;
            this.recipients = recipients;
            this.sender = sender;
            this.timestamp = timestamp;
        }

        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public List<User> getRecipients() {
            return recipients;
        }

        public User getSender() {
            return sender;
        }

        public Date getTimestamp() {
            return timestamp;
        }
    }
}
