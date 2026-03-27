"""
CoffeeMocha.java

Subclass of Coffee. Represents a mocha coffee.
"""

public class CoffeeMocha extends Coffee {
    // Constructor
    public CoffeeMocha() {
        super(); // Name and price for regular coffee
        this.setCostAndDescription("Mocha Coffee", 2.00);
    }
}