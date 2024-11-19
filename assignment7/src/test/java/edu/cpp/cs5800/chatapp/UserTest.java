package edu.cpp.cs5800.chatapp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("testUser1", chatServer);
    User user2 = new User("testUser2", chatServer);

    @Test
    public void testGetUserName() {
        assertEquals("testUser1", user1.getUsername());
    }

    @Test
    public void testSendMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        assertEquals(1, user1.sendMessage("test 123", Arrays.asList(user2)));

        Message message = chatServer.getLastMessage(user1);
        assertEquals("test 123", message.getContent());
        assertEquals(user1, message.getSender());
    }

    @Test
    public void testUndoLastMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        user1.sendMessage("test 123", Arrays.asList(user2));
        assertTrue(user1.undoLastMessage());
    }

    @Test
    public void testGetLastMessage() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        user1.sendMessage("test 123", Arrays.asList(user2));
        String expected = String.format("%s sent to %s: %s", user1.getUsername(), Arrays.asList(user2), "test 123");
        assertEquals(expected, user1.getLastMessage());
    }

    @Test
    public void testBlockUser() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        assertTrue(user1.blockUser(user2));
    }

    @Test
    public void testUnblockUser() {
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        user1.blockUser(user2);

        assertTrue(user1.unblockUser(user2));
    }

}
