"""
CoffeeDecorator.java
It decorates the coffee by allowing the addition of extra toppings.
"""

public class CoffeeDecorator implements Coffee_IF {
    protected Coffee coffee;

    """
    Pick a Coffee object to add toppings to.
    """
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    //Boilerplate Code | Wrapping the methods of Coffee.
    """
    Calls the toString method of the Coffee object stored inside this one.
    """
    @Override
    public String toString() {
        return coffee.toString();
    }

    """
    Calls the getCost method of the Coffee object stored inside this one.
    """
    @Override
    public double getCost() {
        return coffee.getCost();
    }

    """
    Calls the SetCost method of the Coffee object stored inside this one.
    """
    public void setCost(double cost) {
        coffee.setCost(cost);
    }

    """
    Calls the SetCostAndDescription method of the Coffee object stored inside this one.
    """
    public void setCostAndDescription(String description, double cost) {
        coffee.setCostAndDescription(description, cost);
    }
}