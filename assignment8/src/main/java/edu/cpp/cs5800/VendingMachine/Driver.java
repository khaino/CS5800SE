package edu.cpp.cs5800.VendingMachine;

public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.printAvailableSnacks();

        vendingMachine.selectSnack(6);
        vendingMachine.insertMoney(6.5);
        vendingMachine.dispenseSnack();
        System.out.println();

        vendingMachine.printAvailableSnacks();
        vendingMachine.selectSnack(6);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        System.out.println();

        vendingMachine.selectSnack(3);
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();
        System.out.println();

        vendingMachine.selectSnack(4);
        vendingMachine.insertMoney(3.5);
        vendingMachine.dispenseSnack();
        System.out.println();

    }
}
