"""
CoffeeFactory.java

This is the actual coffee machine class that uses the factory pattern to instantiate
different types of coffee.
It prints the required recipe statements to the console and returns a an object in a 
subclass of the Coffee class.
"""

public class CoffeeFactory {
    
    """
    makeCoffee(String type)

    Factory method that selects which type of coffee to make
    """
    public static Coffee makeCoffee(String type) {

        if (type.equalsIgnoreCase("Regular")) {
            setPowerLED(1);
            setTypeLED(1);
            setGrindingTime(8);
            setTemperature(150);
            holdTemperature(2);
            
            // Toppings added in the constructor (if applicable)
            Coffee newCoffee = new Coffee();
            
            wait(15);
            setPowerLED(0);

            newCoffee.setCostAndDescription("Regular Coffee",1.00);
            
            return newCoffee;
            
        } else if (type.equalsIgnoreCase("Mocha")) {
            setPowerLED(1);
            setTypeLED(2);
            setGrindingTime(5);
            setTemperature(200);
            holdTemperature(5);

            // Instantiate coffee object
            Coffee newCoffee = new Coffee();

            wait(15);
            setPowerLED(0);
            
            // Add toppings
            addTopping(newCoffee,0);
            addTopping(newCoffee,2);

            newCoffee.setCostAndDescription("Mocha",2.00);

            return newCoffee;

        } else if (type.equalsIgnoreCase("Latte")) {
            setPowerLED(1);
            setTypeLED(3);
            setGrindingTime(10);
            setTemperature(180);
            holdTemperature(5);

            // Instantiate coffee object
            Coffee newCoffee = new Coffee();

            // Add toppings
            addTopping(newCoffee,0);
            addTopping(newCoffee,1);

            newCoffee.setCostAndDescription("Latte",3.00);

            wait(15);
            setPowerLED(0);

            return newCoffee;
        } else if (type.equalsIgnoreCase("Espresso")) {
            setPowerLED(1);
            setTypeLED(4);
            setGrindingTime(30);
            setTemperature(190);
            holdTemperature(5);

            // Instantiate coffee object
            Coffee newCoffee = new Coffee();

            wait(15);
            setPowerLED(0);

            newCoffee.setCostAndDescription("Espresso",4.00);

            return newCoffee;
        } else if (type.equalsIgnoreCase("Cappuccino")) {
            setPowerLED(1);
            setTypeLED(5);
            setGrindingTime(7);
            setTemperature(200);
            holdTemperature(10);

            // Instantiate coffee object
            Coffee newCoffee = new Coffee();

            // Add milk
            addTopping(newCoffee,3);
            addTopping(newCoffee,3);

            wait(15);
            setPowerLED(0);

            newCoffee.setCostAndDescription("Cappuccino",5.00);

            return newCoffee;
        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
    
    """
    setGrindingTime(int seconds):
    Prints a message indicating the time to grind the coffee beans.
    """
    public void setGrindingTime(int seconds) {
        System.out.println("Grinding coffee beans for " + seconds + " seconds.");
    }
    
    """
    setTemperature(int degrees):
    Prints a message indicating the temperature to heat the water to.
    """
    public void setTemperature(int degrees) {
        System.out.println("Setting water temperature to " + degrees + " degrees Fahrenheit.");
    }

    """
    holdTemperature(int seconds):
    Prints a message indicating the time to hold the water at the set temperature.
    """
    public void holdTemperature(int seconds) {
        System.out.println("Holding water at temperature for " + seconds + " seconds.");
    }

    """
    wait(int seconds):
    Prints a message indicating the time to wait for the coffee to brew.
    """
    public void wait(int seconds) {
        System.out.println("Waiting for " + seconds + " seconds.");
    }

    """
    setPowerLED(int num):
    Prints a message indicating the number displayed by the power LED.
    """
    public void setPowerLED(int num) {
        System.out.println("Power LED: " + num);
    }

    """
    setTypeLED(int num):
    Prints a message indicating the number displayed by the type LED.
    """
    public void setTypeLED(int num) {
        System.out.println("Type LED: " + num);
    }

    """
    displayPrice(Coffee_IF price):
    Prints a message indicating the price of the coffee.
    Accepts any object that uses the Coffee_IF interface.
    """
    public void displayPrice(Coffee_IF price) {
        System.out.println("Price of " + price.toString() + ": $" + price.getCost());
        System.out.println
    }

    """
    addTopping(Coffee coffee, int opt):
    
    Uses the decorators to decorate the target coffee. Accepts a subtype of coffee.
    0 = cream $.25
    1 = vanilla $.50
    2 = chocolate $1.00
    
    *Toppings added beyond requirements:
    3 = milk $.25

    More toppings will be added in due time
    """
    public Coffee addTopping(Coffee coffee, int opt) {
        switch(opt) {
            case 0:
                coffee = new CreamDecorator(coffee);
                break;
            case 1:
                coffee = new VanillaDecorator(coffee);
                break;
            case 2:
                coffee = new ChocolateDecorator(coffee);
                break;
            case 3:
                coffee = new MilkDecorator(coffee);
                break;
            default:
                throw new IllegalArgumentException("Unrecognized Topping Option: "+opt)
        }
    }


}