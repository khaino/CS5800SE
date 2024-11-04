package edu.cpp.cs5800;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderNo = 0;
    private double totalPrice;
    private final List<FoodItem> orderItems = new ArrayList<>();

    public Order() {
        orderNo++;
    }

    public void addItem(FoodItem item) {
        this.totalPrice += item.getPrice();
        orderItems.add(item);
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String getOrderDetails() {
        String itemDivider = "---------------\n";
        String orderDivider = "-------------------------\n";
        StringBuilder details = new StringBuilder();
        details.append(orderDivider);
        details.append("Order No: #").append(orderNo).append("\n");
        details.append(orderDivider);
        for (FoodItem item : this.orderItems) {
            details.append(item.getDescription());
            details.append(itemDivider);
        }
        details.append(Formatter.format("Total", this.getTotalPrice()));
        details.append(orderDivider);
        return details.toString();
    }
}
