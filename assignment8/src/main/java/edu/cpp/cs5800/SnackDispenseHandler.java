package edu.cpp.cs5800;

import edu.cpp.cs5800.snacks.Snack;

public class SnackDispenseHandler {
    private Snack snack;
    private SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(Snack snack, SnackDispenseHandler nextHandler) {
        this.snack = snack;
        this.nextHandler = nextHandler;
    }

    public boolean dispense(int id, double amount) {
        System.out.print(this.snack.getName() + "Handler");
        if (this.snack.getId() == id) {
            System.out.println();
            if (this.snack.getQuantity() == 0) {
                System.out.println("Not enough quantity for item: " + this.snack.getName());
                System.out.printf("Returning money inserted: $%2.2f\n", amount);
            } else if (this.snack.getPrice() <= amount) {
                System.out.println("Dispensing: " + this.snack.dispense() + ", price: $" + this.snack.getPrice());
                if (this.snack.getPrice() < amount) {
                    System.out.printf("Returning Change: $%2.2f\n", amount - this.snack.getPrice());
                }
                return true;
            } else {
                System.out.println("Money inserted is not enough: " + this.snack.getName() + ", price: $" + this.snack.getPrice());
            }
        } else if (this.nextHandler != null) {
            System.out.print("->");
            return this.nextHandler.dispense(id, amount);
        } else {
            System.out.println("Item id not found: " + id);
        }

        return false;
    }
}
