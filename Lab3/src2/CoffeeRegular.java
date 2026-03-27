"""
CoffeeRegular.java

Subclass of Coffee. Represents a regular coffee.
"""

public class CoffeeRegular extends Coffee {
    // Constructor
    public CoffeeRegular() {
        super(); // Name and price for regular coffee
        this.setCostAndDescription("Regular Coffee", 1.00);
    }
}