package edu.cpp.cs5800.VendingMachine;

import edu.cpp.cs5800.VendingMachine.snacks.Snack;
import edu.cpp.cs5800.VendingMachine.states.Idle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdleTest {
    VendingMachine vendingMachine = new VendingMachine();
    Idle idle = new Idle(vendingMachine);

    @Test
    public void testSelectSnack() {
        int snackId = 61;
        Snack snack = vendingMachine.getSnack(snackId);
        String expected = "You have selected: " + snackId + " (" + snack.getName() + ")";
        String actual = idle.selectSnack(snackId);
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertAmount() {
        String expected = "Invalid request: Please first select a snack!";
        assertEquals(expected, idle.insertMoney(6));
    }

    @Test
    public void testDispenseSnack() {
        String expected = "Invalid request: Please first select a snack!";
        assertEquals(expected, idle.dispenseSnack());
    }
}
