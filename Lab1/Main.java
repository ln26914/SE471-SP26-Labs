class Product {
    // Initializing variables
    public static int global_ID = 0;
    
    int ID;
    String name;
    double price;
    
    // Constructor
    public Product(String name, double price){
        this.setName(name);
        this.setPrice(price);
        this.ID = global_ID + 1;
        global_ID++;
    }
    
    // SETTERS !!! There is no set ID because id is final and is automated when created,

    void setName(String newName){
        this.name = newName;
    }
    
    void setPrice(double newPrice){
        this.price = newPrice;
    }
    
    // GETTERS !!!
    int getID(){
        return this.ID;
    }
    
    String getName(){
        return this.name;
    }
    
    double getPrice(){
        return this.price;

    }
    
}

class SortingProxy {
    
}

class SortingUtility {
    
}

public class Main
{
	public static void main(String[] args) {
	    Product myNewProduct = new Product("Book", 10.99);
		System.out.printf("Product name: %s\nPrice: %.2f\nID: %d\n", myNewProduct.getName(), myNewProduct.getPrice(), myNewProduct.getID());
	}
}