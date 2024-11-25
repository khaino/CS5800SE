package edu.cpp.cs5800.snacks;

import edu.cpp.cs5800.VendingMachine;
import edu.cpp.cs5800.states.DispensingSnack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispensingSnackTest {
    VendingMachine vendingMachine = new VendingMachine();
    DispensingSnack dispensingSnack = new DispensingSnack(vendingMachine);

    @Test
    public void testSelectSnack() {
        String expected = "Invalid request: Currently dispensing snack!";
        assertEquals(expected, dispensingSnack.selectSnack(1));
    }

    @Test
    public void testInsertAmount() {
        String expected = "Invalid request: Currently dispensing snack!";
        assertEquals(expected, dispensingSnack.insertMoney(6));
    }

    @Test
    public void testDispenseSnack() {
        String expected = "Completed!";
        assertEquals(expected, dispensingSnack.dispenseSnack());
    }
}
