package edu.cpp.cs5800.states;

import edu.cpp.cs5800.VendingMachine;

public abstract class StateOfVendingMachine {
    protected VendingMachine vendingMachine;

    public StateOfVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract String selectSnack(int number);

    public abstract String insertMoney(double amount);

    public abstract String dispenseSnack();
}
