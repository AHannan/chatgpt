package com.ahannan.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test
    void builderCreatesPerson() {
        Person person = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .build();

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("John Doe (30)", person.toString());
    }
}
