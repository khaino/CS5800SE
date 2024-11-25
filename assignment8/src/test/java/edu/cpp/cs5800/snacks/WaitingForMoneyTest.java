package edu.cpp.cs5800.snacks;

import edu.cpp.cs5800.VendingMachine;
import edu.cpp.cs5800.states.Idle;
import edu.cpp.cs5800.states.WaitingForMoney;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitingForMoneyTest {
    VendingMachine vendingMachine = new VendingMachine();
    WaitingForMoney wfm = new WaitingForMoney(vendingMachine);

    @Test
    public void testSelectSnack() {
        String expected = "Invalid request: Please inserted money!";
        assertEquals(expected, wfm.selectSnack(1));
    }

    @Test
    public void testInsertAmount() {
        vendingMachine.setSelectedSnack(1);
        vendingMachine.setState(wfm);
        String expected = "You have inserted: $" + 6.0;
        assertEquals(expected, wfm.insertMoney(6));
    }

    @Test
    public void testDispenseSnack() {
        String expected = "Invalid request: Please inserted money!";
        assertEquals(expected, wfm.dispenseSnack());
    }
}
