import java.util.ArrayList;
import java.util.List;


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

class SortingProxy extends SortingUtility {
    public void log(ArrayList<Product> unsortedListOfProducts, int sortingApproach){
        SortingUtility mySortingUtility = new SortingUtility();
        if (sortingApproach == 0){ //BubbleSort format: ID, name, price
            mySortingUtility.sort(unsortedListOfProducts, sortingApproach);
            System.out.printf("%-5s%-13s%-5s\n%s\n", "ID", "Name", "Price", "-------------------------");
            for (int i = 0; i < unsortedListOfProducts.size(); i++) {
                System.out.printf("%-5d%-13s%-5.2f\n", unsortedListOfProducts.get(i).ID, unsortedListOfProducts.get(i).name, unsortedListOfProducts.get(i).price);
                }	  
            }
        else if (sortingApproach == 1){ //BubbleSort format: name, ID, price
             mySortingUtility.sort(unsortedListOfProducts, sortingApproach);
            System.out.printf("%-13s%-5s%-5s\n%s\n", "Name", "ID", "Price", "-------------------------");
            for (int i = 0; i < unsortedListOfProducts.size(); i++) {
                System.out.printf("%-13s%-5d%-5.2f\n", unsortedListOfProducts.get(i).name, unsortedListOfProducts.get(i).ID, unsortedListOfProducts.get(i).price);
                }	  
            }
        else{
            System.out.println("\nSortingUtility sort method error: sortingApproach number unrecognized.\n");
        }
    }
}

class SortingUtility {
    public ArrayList<Product> sort(ArrayList<Product> unsortedList, int sortingApproach){
        if (sortingApproach == 0){
            this.bubbleSort(unsortedList);
            System.out.println("\nArrayList has been sorted with BubbleSort algorithm.");
        }
        else if (sortingApproach == 1){
            this.quickSort(unsortedList, 0, unsortedList.size()-1);
            System.out.println("\nArrayList has been sorted with QuickSort algorithm.");
        }
        else{
            System.out.println("\nSortingUtility sort method error: sortingApproach number unrecognized.\n");
            return unsortedList;
        }
        return unsortedList;
    }
    // BubbleSort 
    private void bubbleSort(List<Product> list) {
        int n = list.size();
    
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Product temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
    }
    
    // QuickSort 
    private void quickSort(List<Product> list, int low, int high) {
        if (low >= high) return;
    
        double pivot = list.get(high).getPrice();
        int i = low;
    
        for (int j = low; j < high; j++) {
            if (list.get(j).getPrice() <= pivot) {
                Product temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
            }
        }
    
        Product temp = list.get(i);
        list.set(i, list.get(high));
        list.set(high, temp);
    
        quickSort(list, low, i - 1);
        quickSort(list, i + 1, high);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Product product1 = new Product("Book", 10.99);
	    Product product2 = new Product("Button", 0.99);
	    Product product3 = new Product("Bag", 22.99);
	    Product product4 = new Product("Car", 2500.00);
	    Product product5 = new Product("Fancy Ring", 150.00);
	    ArrayList<Product> myUnsortedListOfProducts = new ArrayList<Product>();
	    myUnsortedListOfProducts.add(product1);
	    myUnsortedListOfProducts.add(product2);
	    myUnsortedListOfProducts.add(product3);
	    myUnsortedListOfProducts.add(product4);
	    myUnsortedListOfProducts.add(product5);
	    System.out.println("Unsorted array of products:");
	    System.out.printf("%-13s%-5s%-5s\n%s\n", "Name", "ID", "Price", "-------------------------");
        for (int i = 0; i < myUnsortedListOfProducts.size(); i++) {
            System.out.printf("%-13s%-5d%-5.2f\n", myUnsortedListOfProducts.get(i).name, myUnsortedListOfProducts.get(i).ID, myUnsortedListOfProducts.get(i).price);
            }	  
        SortingProxy mySortingProxy = new SortingProxy();
        mySortingProxy.log(myUnsortedListOfProducts, 0);
        mySortingProxy.log(myUnsortedListOfProducts, 1);
        mySortingProxy.log(myUnsortedListOfProducts, 2);
	}
}