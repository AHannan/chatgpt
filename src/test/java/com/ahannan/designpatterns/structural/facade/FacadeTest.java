package com.ahannan.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    @Test
    void facadeOperates() {
        Facade facade = new Facade();
        assertEquals("AB", facade.operate());
    }
}
