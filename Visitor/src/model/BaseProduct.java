package model;

public abstract class BaseProduct implements Product {

    private final String name;
    private final double price;
    private final int weightInGrams;

    protected BaseProduct(String name, double price, int weightInGrams) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (weightInGrams <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero");
        }
        this.name = name;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getWeightInGrams() {
        return weightInGrams;
    }
}