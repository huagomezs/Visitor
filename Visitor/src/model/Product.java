package model;

import visitor.Visitor;

public interface Product {
    String getName();
    double getPrice();
    int getWeightInGrams();
    void accept(Visitor visitor);
}