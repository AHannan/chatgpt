package com.ahannan.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void observersReceiveMessages() {
        Subject subject = new Subject();
        ConcreteObserver first = new ConcreteObserver();
        ConcreteObserver second = new ConcreteObserver();
        subject.register(first);
        subject.register(second);

        subject.notifyObservers("update");

        assertEquals("update", first.getLastMessage());
        assertEquals("update", second.getLastMessage());
    }
}
