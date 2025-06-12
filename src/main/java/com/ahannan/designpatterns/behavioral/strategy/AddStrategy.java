package com.ahannan.designpatterns.behavioral.strategy;

/** Strategy that adds two numbers. */
public class AddStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
