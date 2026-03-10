import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    // Test all functionality in this main method
    public static void main(String[] args) {

        // Product: String ID | Srring Name | Double Price | String Brand | String Category | Double Rating 
        List<Product> products = new ArrayList<>();

        // Create products to test with.
        products.add("1", "iPhone 12", 999.99, "Apple", "Smartphone", 4.5);
        products.add("2", "Galaxy S21", 799.99, "Samsung", "Smartphone", 4.3);
        products.add("3", "MacBook Pro", 1299.99, "Apple", "Laptop", 4.7);
        products.add("4", "Surface Laptop", 999.99, "Microsoft", "Laptop", 4);
        products.add("5", "iPad Pro", 799.99, "Apple", "Tablet", 4.6);
        products.add("6", "Galaxy Tab S7", 649.99, "Samsung", "Tablet", 4.4);
        products.add("7", "Apple Watch", 399.99, "Apple", "Smartwatch", 4.8);
        products.add("8", "Galaxy Watch", 349.99, "Samsung", "Smartwatch", 4.2);
        products.add("9", "AirPods Pro", 249.99, "Apple", "Headphones", 4.7);
        products.add("10", "Galaxy Buds Pro", 199.99, "Samsung", "Headphones", 4.3);
        products.add("11", "iMac", 1799.99, "Apple", "Desktop", 4.6);
        products.add("12", "Surface Studio", 2999.99, "Microsoft", "Desktop", 4.1);
        products.add("13", "Apple TV", 149.99, "Apple", "TV", 4.5);

        // Print all products
        System.out.println("All Products: ");
        for (Product product : products) {
            System.out.println(product);
        }

        // Create Criteria to test with
        Criteria brandFilter = new BrandFilter();
        Criteria categoryFilter = new CategoryFilter();
        Criteria priceFilter = new PriceFilter();
        Criteria ratingFilter = new RatingFilter();

        // Test each criteria
        List<Product> appleProducts = brandFilter.meetCriteria(products, "Apple");
        System.out.println("\nApple Products: ");
        for (Product product : appleProducts) {
            System.out.println(product);
        }

        List<Product> smartphoneProducts = categoryFilter.meetCriteria(products, "Smartphone");
        System.out.println("\nSmartphone Products: ");
        for (Product product : smartphoneProducts) {    
            System.out.println(product);
        }

        List<Product> budgetProducts = priceFilter.meetCriteria(products, 500);
        System.out.println("\nProducts under $500: ");
        for (Product product : budgetProducts) {
            System.out.println(product);
        }

        List<Product> highlyRatedProducts = ratingFilter.meetCriteria(products, 4.5);
        System.out.println("\nProducts with rating 4.5 or higher: ");
        for (Product product : highlyRatedProducts) {
            System.out.println(product);
        }

        // Daisy-chain all four criteria together
        List<Criteria> criterias = new ArrayList<>(brandFilter, categoryFilter, priceFilter, ratingFilter);
        List<Product> filteredProducts = AndManyCriteria(products, criterias);
        System.out.println("\nProducts that are Apple, Smartphones, under $500, and have a rating of 4.5 or higher: ");
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }       

    """
    While it's possible to daisychain the AndCriteria together to combine as many criteria as needed,
    that's a pain and I am lazy.
    """
    public List<Product> AndManyCriteria(List<Product> products, List<Criteria> criterias) {
        List<Product> filteredProducts = products;
        for (Criteria criteria : criterias) {
            filteredProducts = criteria.meetCriteria(filteredProducts);
        }
        return filteredProducts;
    }
}