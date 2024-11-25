package edu.cpp.cs5800.snacks;

import edu.cpp.cs5800.VendingMachine;
import edu.cpp.cs5800.states.Idle;
import edu.cpp.cs5800.states.WaitingForMoney;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    VendingMachine vendingMachine = new VendingMachine();

    @Test
    public void testGetSnack() {
        assertEquals("Coke", vendingMachine.getSnack(83).getName());
    }

    @Test
    public void testGetAndSetState() {
        assertEquals((new Idle(vendingMachine)).toString(), vendingMachine.getState().toString());
        vendingMachine.setState(new WaitingForMoney(vendingMachine));
        assertEquals((new WaitingForMoney(vendingMachine)).toString(),
                vendingMachine.getState().toString());
    }

    @Test
    public void testSetAndGetSelectedSnack() {
        vendingMachine.setSelectedSnack(2);
        assertEquals(2, vendingMachine.getSelectedSnack());
    }
}
