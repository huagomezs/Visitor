package model;

import visitor.Visitor;

public class Laptop extends BaseProduct {

    public Laptop(String name, double price, int weightInGrams) {
        super(name, price, weightInGrams);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}