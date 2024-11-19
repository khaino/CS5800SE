package edu.cpp.cs5800.chatapp;

import java.util.Date;
import java.util.List;

public class MessageMemento {
    private int id;
    private String content;
    private List<User> recipients;
    private User sender;
    private Date timestamp;

    public MessageMemento(int id,
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
