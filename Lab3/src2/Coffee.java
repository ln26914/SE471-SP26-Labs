"""
Coffee Interface
This interface forms the core of a decorator pattern for the coffee machine.
It is also used to add condiments to the coffee.
This interface will be used by these classes:
- CoffeeFactory (and the plain coffee variants produced by it)
- 
"""
public interface Coffee {
    public String toString();
    public double getCost();
}