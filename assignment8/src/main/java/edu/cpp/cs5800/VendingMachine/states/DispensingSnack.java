package edu.cpp.cs5800.VendingMachine.states;

import edu.cpp.cs5800.VendingMachine.VendingMachine;

public class DispensingSnack extends StateOfVendingMachine {

    public DispensingSnack(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public String selectSnack(int number) {
        String message = "Invalid request: Currently dispensing snack!";
        System.out.println("Invalid request: Currently dispensing snack!");
        return message;
    }

    @Override
    public String insertMoney(double amount) {
        String message = "Invalid request: Currently dispensing snack!";
        System.out.println("Invalid request: Currently dispensing snack!");
        return message;
    }

    @Override
    public String dispenseSnack() {
        int selectedItem = this.vendingMachine.getSelectedSnack();
        double amt = this.vendingMachine.getInsertedAmount();
        System.out.print("Chain of responsibility: ");
        this.vendingMachine.getSnackDispenseHandler().dispense(selectedItem, amt);
        String message = "Completed!";
        System.out.println(message);
        this.vendingMachine.setState(new Idle(this.vendingMachine));
        return message;
    }

    public String toString() {
        return "DispensingSnack";
    }
}
