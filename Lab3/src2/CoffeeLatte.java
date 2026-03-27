"""
CoffeeLatte.java

Subclass of Coffee. Represents a latte coffee.
"""

public class CoffeeLatte extends Coffee {
    // Constructor
    public CoffeeLatte() {
        super(); // Name and price for regular coffee
        this.setCostAndDescription("Latte Coffee", 3.00);
    }
}