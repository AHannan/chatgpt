package com.ahannan.designpatterns.structural.facade;

/**
 * Facade providing a simplified interface to underlying subsystems.
 */
public class Facade {
    private final SubsystemA subsystemA = new SubsystemA();
    private final SubsystemB subsystemB = new SubsystemB();

    public String operate() {
        return subsystemA.operationA() + subsystemB.operationB();
    }
}
