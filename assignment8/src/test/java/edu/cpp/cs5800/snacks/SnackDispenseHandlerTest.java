package edu.cpp.cs5800.snacks;

import edu.cpp.cs5800.SnackDispenseHandler;
import edu.cpp.cs5800.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SnackDispenseHandlerTest {
    VendingMachine vendingMachine = new VendingMachine();
    SnackDispenseHandler handler = vendingMachine.getSnackDispenseHandler();

    @Test
    public void testDispenseWithEnoughMoneyAndQty() {
        assertTrue(handler.dispense(6, 10));
    }

    @Test
    public void testDispenseWithNotEnoughQty() {
        assertFalse(handler.dispense(6, 10));
    }

    @Test
    public void testDispenseWithNotEnoughMoney() {
        assertFalse(handler.dispense(1, 1));
    }

    @Test
    public void testDispenseSnackNotFound() {
        assertFalse(handler.dispense(7, 1));
    }
}
