package edu.cpp.cs5800.VendingMachine;

import edu.cpp.cs5800.VendingMachine.snacks.Snack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnackDummy extends Snack {

    public SnackDummy(int quantity, double price) {
        super("SnackDummy", quantity, price);
    }
}

public class SnackTest {
    Snack snack = new SnackDummy(3, 1.5);

    @Test
    public void TestGetName() {
        assertEquals("SnackDummy", snack.getName());
    }

    @Test
    public void TestGetQuantity() {
        assertEquals(3, snack.getQuantity());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(1.5, snack.getPrice());
    }

    @Test
    public void TestDispense() {
        assertEquals("SnackDummy", snack.dispense());
        assertEquals(2, snack.getQuantity());
    }
}
