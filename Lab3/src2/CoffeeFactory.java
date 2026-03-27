"""
CoffeeFactory.java

This is the actual coffee machine class that uses the factory pattern to instantiate
different types of coffee.
It prints the required recipe statements to the console and returns a an object in a 
subclass of the Coffee class.
"""

public class CoffeeFactory {
    
    /*
    public static Coffee makeCoffee(String type) {
        if (type.equalsIgnoreCase("Regular")) {
            
        } else if (type.equalsIgnoreCase("Mocha")) {
            
        } else if (type.equalsIgnoreCase("Latte")) {
            
        } else if (type.equalsIgnoreCase("Espresso")) {
        
        } else if (type.equalsIgnoreCase("Cappucino")) {

        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
    */
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
        System.out.println("Price: $" + price.getCost());
    }


}