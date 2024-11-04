package edu.cpp.cs5800;

import edu.cpp.cs5800.addons.CheeseDecorator;
import edu.cpp.cs5800.addons.LettuceDecorator;
import edu.cpp.cs5800.addons.PicklesDecorator;
import edu.cpp.cs5800.addons.TomatoDecorator;
import edu.cpp.cs5800.customer.Customer;
import edu.cpp.cs5800.customer.GoldCustomer;
import edu.cpp.cs5800.customer.PlatinumCustomer;
import edu.cpp.cs5800.customer.SilverCustomer;

public class Driver {
    public static void main(String[] args) {
        Order o1 = new Order();
        Customer c1 = new PlatinumCustomer();
        o1.addItem(new TomatoDecorator(new CheeseDecorator(new ChickenBurger())));
        o1.addItem(new PicklesDecorator(new VeggieBurger()));
        System.out.print(o1.getOrderDetails());
        System.out.println(c1.applyLoyaltyDiscount(o1.getTotalPrice()));

        Order o2 = new Order();
        Customer c2 = new GoldCustomer();
        o2.addItem(new LettuceDecorator(new CheeseDecorator(new TomatoDecorator(new FishBurger()))));
        System.out.print(o2.getOrderDetails());
        System.out.println(c2.applyLoyaltyDiscount(o2.getTotalPrice()));

        Order o3 = new Order();
        Customer c3 = new SilverCustomer();
        o3.addItem(new ChickenBurger());
        System.out.print(o3.getOrderDetails());
        System.out.println(c3.applyLoyaltyDiscount(o3.getTotalPrice()));
    }
}
