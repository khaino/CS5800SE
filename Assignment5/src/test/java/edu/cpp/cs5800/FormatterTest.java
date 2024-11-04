package edu.cpp.cs5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest {

    @Test
    public void testFormat() {
        String expected = "Name                10.00\n";
        assertEquals(expected, Formatter.format("Name", 10.0));
    }
}
