package com.bootcampexcercise.modul9.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person();
    }

    @AfterEach
    public void tearDown() {
        person = null;
    }

    @Test
    public void testWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    @Test
    public void testHeight() {
        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight());
    }

    @Test
    public void testBodyMassIndex() {
        String result = person.getBodyMassIndex(1.80f, 80);
        assertTrue(result.contains("BMI = "));
    }

    @Test
    public void testWrongHeight() {
        String result = person.getBodyMassIndex(0, 80);
        assertEquals("Height and weight must be more than 0", result);
    }

    @Test
    public void testWrongWeight() {
        String result = person.getBodyMassIndex(1.80f, 0);
        assertEquals("Height and weight must be more than 0", result);
    }
}
