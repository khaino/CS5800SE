package edu.cpp.cs5800.chatapp;


import java.util.*;

public class ChatServer {
    private Set<User> users = new HashSet<>();
    private Map<User, Set<User>> blockedUsers = new HashMap<>();
    private ChatHistory chatHistory = new ChatHistory();

    public boolean registerUser(User user) {
        System.out.println(user.getUsername() + " has been registered!");
        return users.add(user);
    }

    public boolean unregisterUser(User user) {
        System.out.println(user.getUsername() + " has been unregistered!");
        return users.remove(user);
    }

    public boolean blockUser(User blocker, User blockee) {
        if (!blockedUsers.containsKey(blocker)) {
            blockedUsers.put(blocker, new HashSet<>());
        }
        System.out.println(blocker.getUsername() + " has blocked " + blockee.getUsername() + "!");
        return blockedUsers.get(blocker).add(blockee);
    }

    public boolean unblockUser(User blocker, User blockee) {
        System.out.println(blocker.getUsername() + " has unblocked " + blockee.getUsername() + "!");
        return blockedUsers.get(blocker) != null && blockedUsers.get(blocker).remove(blockee);
    }


    public int sendMessage(Message message) {
        User sender = message.getSender();
        if (!users.contains(sender)) {
            System.out.println("Failed to send message, " + sender.getUsername() + "  is not registered!");
            return 0;
        }

        int count = 0;
        for (User recipient : message.getRecipients()) {
            if (!users.contains(recipient)) {
                System.out.println("Failed to send message, " + recipient.getUsername() + " is not registered!");
            } else if (blockedUsers.get(recipient) != null && blockedUsers.get(recipient).contains(sender)) {
                System.out.println("Failed to send message, " + sender.getUsername() + " is blocked by " + recipient.getUsername() + "!");
            } else {
                System.out.println(sender.getUsername() + " sent message: `" + message.getContent() + "` to " + recipient.getUsername());
                recipient.receiveMessage(message);

                count++;
            }
        }
        if (count > 0) {
            this.chatHistory.addMessage(message);
        }
        return count;
    }

    public boolean unsendMessage(Message message) {
        if (this.chatHistory.removeMessage(message)) {
            System.out.println(message.getSender()
                    .getUsername() + " unsent message: `" + message.getContent() + "` to " + message.getRecipients());
            return true;
        } else {
            System.out.println(message.getSender()
                    .getUsername() + " unsent message failed " + message.getContent() + " to " + message.getRecipients());
            return false;
        }

    }

    public Iterator<Message> getChatIterator(User user) {
        return this.chatHistory.iterator(user);
    }

    public Message getLastMessage(User user) {
        return this.chatHistory.getLastMessage(user);
    }
}
