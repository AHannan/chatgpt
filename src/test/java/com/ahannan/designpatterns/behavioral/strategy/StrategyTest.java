package com.ahannan.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void calculatorUsesDifferentStrategies() {
        Calculator calculator = new Calculator(new AddStrategy());
        assertEquals(5, calculator.calculate(2, 3));

        calculator.setStrategy(new MultiplyStrategy());
        assertEquals(6, calculator.calculate(2, 3));
    }
}
