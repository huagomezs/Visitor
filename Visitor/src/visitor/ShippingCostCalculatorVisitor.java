package visitor;

import model.DesktopComputer;
import model.Laptop;
import model.Product;
import model.Tablet;
import model.Television;

public class ShippingCostCalculatorVisitor implements Visitor {

    private double shippingCost = 0;

    @Override
    public void visit(Tablet tablet) {
        shippingCost += calculateShipping(tablet);
    }

    @Override
    public void visit(Laptop laptop) {
        shippingCost += calculateShipping(laptop);
    }

    @Override
    public void visit(DesktopComputer desktopComputer) {
        shippingCost += calculateShipping(desktopComputer);
    }

    @Override
    public void visit(Television television) {
        shippingCost += calculateShipping(television);
    }

    // shippingPercentage = (weightInGrams / 100) * 2
    // shippingCost = price * shippingPercentage / 100
    private double calculateShipping(Product product) {
        double shippingPercentage = (product.getWeightInGrams() / 100.0) * 2;
        return product.getPrice() * shippingPercentage / 100;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}