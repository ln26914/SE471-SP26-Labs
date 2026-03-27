"""
main.java

This file contains a class which contains the main method.
One must imagine the salaryman happy
"""

public class Main {
    public static void main(String[] args) {

        // Create the Coffee Factory
        CoffeeFactory bespresso;

        bespresso.setPowerLED(1);
        bespresso.setTypeLED(0);

        // Make a Mocha with 1 serving of chocolate added
        Coffee client1 = bespresso.makeCoffee("Mocha");
        bespresso.addTopping(client1,2);
        bespresso.displayPrice(client1);

        // Make an espresso with two servings of chocolate in addition to one cream and one vanilla
        Coffee client2 = bespresso.makeCoffee("Espresso");
        bespresso.addTopping(client2,2);
        bespresso.addTopping(client2,2);
        bespresso.addTopping(client2,0);
        bespresso.addTopping(client2,1);

        bespresso.displayPrice(client2);

    }
}