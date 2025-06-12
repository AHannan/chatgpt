package com.ahannan.designpatterns.creational.factory;

/** Square implementation of {@link Shape}. */
public class Square implements Shape {
    @Override
    public String draw() {
        return "Drawing a square";
    }
}
