package edu.cpp.cs5800.chatapp;


import java.util.Arrays;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("Jack", chatServer);
        User user2 = new User("Mark", chatServer);
        User user3 = new User("Lucy", chatServer);

        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        chatServer.registerUser(user3);

        user1.sendMessage("Hello everyone", Arrays.asList(user2, user3));
        user2.sendMessage("Hi " +  user1.getUsername(), Arrays.asList(user1));
        user3.sendMessage("What's up " +  user1.getUsername(), Arrays.asList(user1));
        user3.sendMessage("Hope you all are doing great.", Arrays.asList(user1, user2));
        user3.sendMessage("How was your weekend " +  user2.getUsername() + "?", Arrays.asList(user2));
        printChatHistory(user2);

        System.out.printf("------%s's Last Message------\n", user3.getUsername());
        System.out.println(user3.getLastMessage());
        printChatHistory(user3);

        System.out.println();
        user3.undoLastMessage();
        printChatHistory(user3);

        user3.blockUser(user1);
        user1.sendMessage("Hi " + user3.getUsername(), Arrays.asList(user3));
        System.out.println();

        user3.unblockUser(user1);
        user1.sendMessage("Hi " + user3.getUsername(), Arrays.asList(user3));
        System.out.println();
        printChatHistory(user3);
    }

    private static void printChatHistory(User user) {
        System.out.printf("------%s's Chat History------\n", user.getUsername());
        Iterator<Message> chatIterator= user.getChatIterator();
        while (chatIterator.hasNext()) {
            Message message = chatIterator.next();
            String time = message.getTimestamp().toString();
            String senderName = message.getSender().equals(user) ? user.getUsername(): message.getSender().getUsername();
            String recipient = senderName.equals(user.getUsername()) ? message.getRecipients().toString() : user.getUsername();
            String data = String.format("[%s]%s -> %s: %s",
                    time,
                    senderName,
                    recipient,
                    message.getContent());
            System.out.println(data);
        }
        System.out.println();
    }
}
