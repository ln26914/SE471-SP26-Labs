"""
ChocolateDecorator.java

Uses the decorator pattern to add Chocolate to the coffee for a $1 surcharge.
"""

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +chocolate";
    }
}