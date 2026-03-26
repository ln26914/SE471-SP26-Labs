"""
VanillaDecorator.java

Uses the decorator pattern to add vanilla to the coffee for a $0.50 surcharge.
"""

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +vanilla";
    }
}