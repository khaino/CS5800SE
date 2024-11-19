package edu.cpp.cs5800.chatapp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChatHistoryTest {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("testUser1", chatServer);
    User user2 = new User("testUser2", chatServer);
    User user3 = new User("testUser3", chatServer);

    ChatHistory chatHistory = new ChatHistory();

    @Test
    public void testAddMessage() {
        Message message = new Message("test content", null, user1);
        assertTrue(chatHistory.addMessage(message));
        assertEquals(message, chatHistory.getLastMessage(user1));
    }

    @Test
    public void testGetLastMessage() {
        Message message2 = new Message("test content 2", null, user1);
        chatHistory.addMessage(message2);
        assertEquals(message2, chatHistory.getLastMessage(user1));
    }

    @Test
    public void testGetHistory() {
        Message message1 = new Message("test content 1", Arrays.asList(user2), user1);
        Message message2 = new Message("test content 2", Arrays.asList(user3), user2);
        Message message3 = new Message("test content 3", Arrays.asList(user2), user1);

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);
        chatHistory.addMessage(message3);

        List<Message> expected = Arrays.asList(message1, message3);
        assertEquals(expected, chatHistory.getHistory(user1));
    }

    @Test
    public void testRemoveMessage() {
        Message message1 = new Message("test content 1", Arrays.asList(user2), user1);
        Message message2 = new Message("test content 2", Arrays.asList(user3), user2);
        Message message3 = new Message("test content 3", Arrays.asList(user2), user1);

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);
        chatHistory.addMessage(message3);

        assertTrue(chatHistory.removeMessage(message3));
        assertEquals(message1, chatHistory.getLastMessage(user1));
    }

    @Test
    public void testIterator() {
        Message message1 = new Message("test content 1", null, user1);
        chatHistory.addMessage(message1);
        assertInstanceOf(Iterator.class, chatHistory.iterator(user1));
    }
}
