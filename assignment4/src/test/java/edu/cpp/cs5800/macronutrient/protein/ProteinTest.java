package edu.cpp.cs5800.macronutrient.protein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProteinImpl extends Protein {
    @Override
    public String getName() {
        return "";
    }
}

public class ProteinTest {
    @Test
    public void testGetName() {
        assertEquals("Protein", (new ProteinImpl()).getType());
    }
}
