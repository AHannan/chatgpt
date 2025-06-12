package com.ahannan.designpatterns.behavioral.strategy;

/** Strategy that multiplies two numbers. */
public class MultiplyStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
