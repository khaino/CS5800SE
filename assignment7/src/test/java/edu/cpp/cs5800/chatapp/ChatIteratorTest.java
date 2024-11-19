package edu.cpp.cs5800.chatapp;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class ChatIteratorTest {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("testUser1", chatServer);

    ChatHistory chatHistory = new ChatHistory();

    @Test
    public void testHasNext() {
        Message message1 = new Message("test content 1", null, user1);
        chatHistory.addMessage(message1);
        Iterator<Message> iterator = chatHistory.iterator(user1);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testNext() {
        Message message1 = new Message("test content 1", null, user1);
        chatHistory.addMessage(message1);
        Iterator<Message> iterator = chatHistory.iterator(user1);
       assertEquals(message1, iterator.next());
    }
}
