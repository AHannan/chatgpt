package com.ahannan.designpatterns.behavioral.observer;

/**
 * Simple observer implementation that stores the last received message.
 */
public class ConcreteObserver implements Observer {
    private String lastMessage;

    @Override
    public void update(String message) {
        this.lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
