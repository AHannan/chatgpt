package com.ahannan.designpatterns.behavioral.observer;

/** Observer interface that receives updates from a Subject. */
public interface Observer {
    void update(String message);
}
