package com.ahannan.designpatterns.creational.factory;

/** Circle implementation of {@link Shape}. */
public class Circle implements Shape {
    @Override
    public String draw() {
        return "Drawing a circle";
    }
}
