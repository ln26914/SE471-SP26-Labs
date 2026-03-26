"""
Coffee.java
Abstract class for hot water-based bean beverage.

Contains the implementation for the Coffee class, which is the foundation on
which a veritable mountain of coffee toppings can be built.
"""
public class Coffee implements Coffee_IF {
    private String description; // Description of the coffee
    private double cost; // Cost of the coffee

    //Constructor to create a basic coffee
    public Coffee() {
        this.description = "Plain Coffee";
        this.cost = 1.0; 
    }

    """
    Gets the description of the coffee, including the starting description
    and the toppings provided. Returns the value as a string.
    """
    @Override
    public String toString() {
        return description;
    }

    """
    Returns the price of the coffee as a decimal.
    It does not trim the decimal to 2 places, so be wary of junk data.
    """
    @Override
    public double getCost() {
        return cost;
    }
    
    """
    Sets both the cost and description of the coffee.
    Options for the project as instructed: regular, mocha, latte, espresso, and cappucino.
    A new drink can be added by using a different string for description.

    Since the cost of a coffee is determined by its description, both should be modified
    together.
    """
    public void setCostAndDescription(String description, double cost) {
        this.cost = cost;
        this.description = description;
    }

    """
    Sets the cost of the coffee to a double.
    Overrides the cost of the coffee but not the toppings.
    """
    public void setCost(double cost) {
        this.cost = cost;
    }
}