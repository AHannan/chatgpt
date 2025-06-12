package com.ahannan.designpatterns.structural.adapter;

/**
 * Adapter that allows an {@link Adaptee} to be used as a {@link Target}.
 */
public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return adaptee.specificRequest();
    }
}
