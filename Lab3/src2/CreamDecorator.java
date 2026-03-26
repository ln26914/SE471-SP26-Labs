"""
CreamDecorator.java

Uses the decorator pattern to add cream to the coffee for a $0.25 surcharge.
"""

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +cream";
    }
}