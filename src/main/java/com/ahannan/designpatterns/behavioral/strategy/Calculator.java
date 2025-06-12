package com.ahannan.designpatterns.behavioral.strategy;

/**
 * Context that uses a {@link Strategy} to perform calculations.
 */
public class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.execute(a, b);
    }
}
