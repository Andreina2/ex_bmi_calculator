package dev.andreina.ex_bmi_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetHeight() {

        Person person=  new Person(70, 1.7);
        assertEquals(1.7, person.getHeight());
        

    }

    @Test
    void testGetWeight() {
        Person person=  new Person(70, 1.7);
        assertEquals(70, person.getWeight());

    }

    @Test
    void testSetHeight() {
        Person person=  new Person(65, 1.6);
        person.setHeight(1.7);
        assertEquals(1.7, person.getHeight());

    }

    @Test
    void testSetWeight() {
        Person person=  new Person(65, 1.6);
        person.setWeight(67);
        assertEquals(67, person.getWeight());

    }
}
