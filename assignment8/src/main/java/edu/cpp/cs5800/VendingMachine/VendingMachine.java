package edu.cpp.cs5800.VendingMachine;

import edu.cpp.cs5800.VendingMachine.snacks.*;
import edu.cpp.cs5800.VendingMachine.states.Idle;
import edu.cpp.cs5800.VendingMachine.states.StateOfVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private StateOfVendingMachine state = new Idle(this);
    private int selectedSnack;
    private double insertedAmount;
    private SnackDispenseHandler snackDispenseHandler;

    private Map<Integer, Snack> stocks = new HashMap<>();

    public VendingMachine() {
        Coke coke = new Coke(15, 3);
        Pepsi pepsi = new Pepsi(15, 3);
        Cheetos cheetos = new Cheetos(15, 2.5);
        Doritos doritos = new Doritos(15, 3.5);
        KitKat kitkat = new KitKat(2, 5);
        Snickers snickers = new Snickers(1, 4);

        SnackDispenseHandler snickersHandler = new SnackDispenseHandler(snickers, null);
        SnackDispenseHandler kitkatHandler = new SnackDispenseHandler(kitkat, snickersHandler);
        SnackDispenseHandler doritosHandler = new SnackDispenseHandler(doritos, kitkatHandler);
        SnackDispenseHandler cheetosHandler = new SnackDispenseHandler(cheetos, doritosHandler);
        SnackDispenseHandler pepsiHandler = new SnackDispenseHandler(pepsi, cheetosHandler);
        snackDispenseHandler = new SnackDispenseHandler(coke, pepsiHandler);

        stocks.put(coke.getId(), coke);
        stocks.put(pepsi.getId(), pepsi);
        stocks.put(cheetos.getId(), cheetos);
        stocks.put(doritos.getId(), doritos);
        stocks.put(kitkat.getId(), kitkat);
        stocks.put(snickers.getId(), snickers);
    }

    public void printAvailableSnacks() {
        for (int key: stocks.keySet().stream().sorted().toList()) {
            Snack snack = stocks.get(key);
            System.out.println(key + ": " + snack.getName() + ", price: $" + snack.getPrice() + ", stock: " + snack.getQuantity());
        }
        System.out.println();
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public Snack getSnack(int number) {
        return stocks.getOrDefault(number, null);
    }

    public void setState(StateOfVendingMachine state) {
        System.out.println("State transition: " + this.state + "-->" + state);
        System.out.println("--------------------");
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public int getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(int selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    public double getInsertedAmount() {
        return insertedAmount;
    }

    public void setInsertedAmount(double insertedAmount) {
        this.insertedAmount = insertedAmount;
    }

    public void selectSnack(int number) {
        this.state.selectSnack(number);
    }

    public void insertMoney(double amount) {
        this.state.insertMoney(amount);
    }

    public void dispenseSnack() {
        this.state.dispenseSnack();
    }
}
