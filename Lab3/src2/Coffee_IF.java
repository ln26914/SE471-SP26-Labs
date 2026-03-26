"""
Coffee Interface (Coffee_IF)
This interface forms the core of a decorator pattern for the coffee machine.
It is also used to add condiments to the coffee.
This interface will be used by these classes:
- CoffeeTopping (and its subclasses)
- CoffeeDecorator (You won't believe what it does)
- CoffeeMachine (Decorates the Coffee and sets its price)
- Coffee (one must imagine the salaryman happy)
"""
public interface Coffee_IF {
    public String toString();
    public double getCost();
}