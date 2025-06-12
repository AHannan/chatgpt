package com.ahannan.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable subject that notifies registered observers.
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
