package edu.cpp.cs5800.VendingMachine.snacks;

public abstract class Snack {
    private static int idIncremnt = 1;
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Snack(String name, int quantity, double price) {
        this.id = idIncremnt++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String dispense() {
        quantity--;
        return name;
    }

    public static void resetId() {
        idIncremnt = 1;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
