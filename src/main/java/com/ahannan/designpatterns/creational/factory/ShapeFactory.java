package com.ahannan.designpatterns.creational.factory;

/**
 * Factory to create {@link Shape} instances.
 */
public final class ShapeFactory {
    private ShapeFactory() {
    }

    public static Shape createShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
        };
    }
}
