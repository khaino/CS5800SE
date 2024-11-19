package edu.cpp.cs5800.chatapp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("testUser1", chatServer);
    User user2 = new User("testUser2", chatServer);
    Message message = new Message("test content", Arrays.asList(user2), user1);

    @Test
    public void testGetContent() {
        assertEquals("test content", message.getContent());
    }

    @Test
    public void testGetRecipients() {
        assertEquals(Arrays.asList(user2), message.getRecipients());
    }

    @Test
    public void testGetSender() {
        assertEquals(user1, message.getSender());
    }

    @Test
    public void testTakeSnapshot() {
       Message.Memento memento =  message.takeSnapshot();
       assertEquals(memento.getContent(), message.getContent());
       assertEquals(memento.getTimestamp(), message.getTimestamp());
    }

    @Test
    public void testRestoreSnapshot() {
        Message.Memento memento =  message.takeSnapshot();
        Message message2 = Message.restoreSnapshot(memento);
        assertEquals(message.getId(), message2.getId());
        assertEquals(message.getContent(), message2.getContent());
        assertEquals(message.getSender(), message2.getSender());
        assertEquals(message.getRecipients(), message2.getRecipients());
        assertEquals(message.getTimestamp(), message2.getTimestamp());
    }
}
