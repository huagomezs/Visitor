package model;

import visitor.Visitor;

public class Television extends BaseProduct {

    public Television(String name, double price, int weightInGrams) {
        super(name, price, weightInGrams);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}