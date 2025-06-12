package com.ahannan.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void createsCorrectShape() {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.createShape(ShapeType.SQUARE);

        assertEquals("Drawing a circle", circle.draw());
        assertEquals("Drawing a square", square.draw());
        assertTrue(circle instanceof Circle);
        assertTrue(square instanceof Square);
    }
}
