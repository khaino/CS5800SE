package edu.cpp.cs5800.chatapp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChatServerTest {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("testUser1", chatServer);
    User user2 = new User("testUser2", chatServer);

    @Test
    public void testRegisterUser() {
        assertTrue(chatServer.registerUser(user1));
    }

    @Test
    public void testUnregisterUser() {
        chatServer.registerUser(user1);
        assertTrue(chatServer.unregisterUser(user1));
    }

    @Test
    public void testBlockUser() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);

        assertTrue(chatServer.blockUser(user1, user2));
    }

    @Test
    public void testUnblockUser() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        chatServer.blockUser(user1, user2);

        assertTrue(chatServer.unblockUser(user1, user2));
    }

    @Test
    public void testSendMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        Message message = new Message("test message", Arrays.asList(user2), user1);
        assertEquals(1, chatServer.sendMessage(message));
    }

    @Test
    public void testUnsendMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        Message message = new Message("test message", Arrays.asList(user2), user1);
        chatServer.sendMessage(message);
        assertTrue(chatServer.unsendMessage(message));
    }

    @Test
    public void testGetLastMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        Message message = new Message("test message", Arrays.asList(user2), user1);
        chatServer.sendMessage(message);
        assertEquals(message, chatServer.getLastMessage(user1));
    }
}
