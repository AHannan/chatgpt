package com.ahannan.designpatterns.creational.singleton;

/**
 * Basic eager initialization singleton example.
 */
public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // prevent instantiation
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String greet() {
        return "Hello from Singleton";
    }
}
