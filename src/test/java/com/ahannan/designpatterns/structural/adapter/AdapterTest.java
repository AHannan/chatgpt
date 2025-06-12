package com.ahannan.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void adaptsRequest() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        assertEquals("adaptee", target.request());
    }
}
