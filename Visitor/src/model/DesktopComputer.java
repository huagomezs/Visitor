package model;

import visitor.Visitor;

public class DesktopComputer extends BaseProduct {

    public DesktopComputer(String name, double price, int weightInGrams) {
        super(name, price, weightInGrams);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}