import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    // Test all functionality in this main method
    public static void main(String[] args) {

        // Product: String ID | Srring Name | Double Price | String Brand | String Category | Double Rating 
        List<Product> products = new ArrayList<>();
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