package com.ahannan.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Singleton}.
 */
class SingletonTest {

    @Test
    void sameInstanceReturned() {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();
        assertSame(first, second, "getInstance should always return the same instance");
    }
}
