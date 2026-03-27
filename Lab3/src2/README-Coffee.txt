Problem 2:
Develop a versatile coffee making machine (CMM). The CMM has a number of built-in functionalities: setGrindingTime(int secs), setTemperature(int degree), 
holdTemperature(int seconds), wait(int seconds), setPowerLED (int num), setTypeLED (int num), and displayPrice(CoffeeIF cf). 
When the CMM is powered on, its menu allows a user to select one from a list of 5 coffee maker programs that make Regular, Mocha, Latte, Espresso, 
and Cappuccino coffees, respectively. Each coffee maker program (say, RegularProgram) has a makeCoffee() method that produces a cup of coffee of that type 
when it runs to completion. The makeCoffee() method has to call the built-in functionalities of CMM in an appropriate order (some examples shown below). 
Due to memory constraints, at any time only one coffee program can be loaded into the run-time memory from an external flash memory. 
The CMM has an LED display with two digits. The first digit is either 0 running or 1 not running. The second digit is from 1 to 5, indicating the currently
chosen coffee program. 
The menu prices for coffees without condiments are $1/cup for regular, $2/cup for Mocha, $3/cup for Latte, $4 for Espresso, and $5/cup for Cappuccino.
The machine offers a variety of condiments. The charge each serve is $.25 for cream, $.50 for vanilla, and $1 for chocolate. All condiments can be mixed 
and added repeatedly as desired and the sale price will simply add up. The CMM stores their sale records into a data structure List<CoffeeIF>. 
The makeCoffee() operation of the Regular coffee maker program run the followings in order (calling CMM’s operations).
Indicate the machine as running and display the purchased type of coffee to LED. 
Grind coffee beans for 8 seconds.
Heat up the water to 150 degree F and hold the temperature for 2 seconds. 
After 15 seconds, set the LED to indicate the machine is not running. 
The makeCoffee () operation of the Mocha coffee maker program run the followings in sequence.  
Indicate the machine as running and display the purchased type of coffee to LED. 
Grind coffee beans for 5 seconds.
Heat up the water to 200 degree F and hold the temperature for 5 seconds. 
Add cream and vanilla once. 
After 15 seconds, set the LED to indicate the machine is not running. 
You may implement the makeCoffee () operation of the other programs at your own choice.
Let different coffee types and condiments have a menu price. The coffee machine’s method displayPrice(CoffeeIF cf) should print out the final sale price of 
the coffee. For simplicity, the other methods only require a message prompt. For example, setGrindingTime(2) displays a message like “Grinding for 2 
seconds.” 
Please prepare a main program to test your software. There will be two cups of coffee sold. Show the necessary operations of the machine and finally print 
out the sale price for each. 
A cup of Mocha with one serve of chocolate added.
Besides the cream and vanilla, a cup of Espresso with also two serves of chocolate added. 

Patterns to be Implemented:

Decorator
Factory
