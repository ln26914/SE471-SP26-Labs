"""
MilkDecorator.java

Uses the decorator pattern to add milk to the coffee for a $0.25 surcharge.
"""

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +milk";
    }
}