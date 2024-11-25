package edu.cpp.cs5800.VendingMachine.states;

import edu.cpp.cs5800.VendingMachine.VendingMachine;

public class WaitingForMoney extends StateOfVendingMachine {

    public WaitingForMoney(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public String selectSnack(int number) {
        String message = "Invalid request: Please inserted money!";
        System.out.println(message);
        return message;
    }

    @Override
    public String insertMoney(double amount) {
        String message = "You have inserted: $" + amount;
        System.out.println(message);
        this.vendingMachine.setInsertedAmount(amount);
        this.vendingMachine.setState(new DispensingSnack(this.vendingMachine));
        return message;
    }

    @Override
    public String dispenseSnack() {
        String message = "Invalid request: Please inserted money!";
        System.out.println("Invalid request: Please inserted money!");
        return message;
    }

    public String toString() {
        return "WaitingForMoney";
    }
}
