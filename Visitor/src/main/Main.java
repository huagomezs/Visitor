package main;

import model.DesktopComputer;
import model.Laptop;
import model.Order;
import model.Tablet;
import model.Television;
import visitor.ShippingCostCalculatorVisitor;
import visitor.SubtotalCalculatorVisitor;

public class Main {

    public static void main(String[] args) {
        
        Order emptyOrder = new Order();
        printOrder("Empty order", emptyOrder);


        Order order = new Order();
        order.addProduct(new Tablet("Tablet", 200, 250), 2);
        order.addProduct(new Laptop("Laptop", 400, 1000), 1);
        order.addProduct(new DesktopComputer("Desktop Computer", 600, 6000), 1);
        order.addProduct(new Television("Television", 300, 4000), 1);

        printOrder("Wtech order", order);
    }

    private static void printOrder(String title, Order order) {
        
        SubtotalCalculatorVisitor subtotalVisitor = new SubtotalCalculatorVisitor();
        order.accept(subtotalVisitor);

        ShippingCostCalculatorVisitor shippingVisitor = new ShippingCostCalculatorVisitor();
        order.accept(shippingVisitor);

        double subtotal = subtotalVisitor.getSubtotal();
        double shipping = shippingVisitor.getShippingCost();

        System.out.println( title );
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Shipping: $%.2f%n", shipping);
        System.out.printf("Total:    $%.2f%n%n", subtotal + shipping);
    }
}