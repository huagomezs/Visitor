package model;

import java.util.ArrayList;
import java.util.List;
import visitor.Visitor;

public class Order {

    private static class OrderItem {
        private final Product product;
        private final int quantity;

        private OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    private final List<OrderItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        items.add(new OrderItem(product, quantity));
    }

    public void accept(Visitor visitor) {
        for (OrderItem item : items) {
            for (int i = 0; i < item.quantity; i++) {
                item.product.accept(visitor);
            }
        }
    }
}