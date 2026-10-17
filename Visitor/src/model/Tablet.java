package model;

import visitor.Visitor;

public class Tablet extends BaseProduct {

    public Tablet(String name, double price, int weightInGrams) {
        super(name, price, weightInGrams);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}