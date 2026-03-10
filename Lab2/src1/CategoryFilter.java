import java.util.ArrayList;
import java.util.List;

public class CategoryFilter implements Criteria {
    
    """
    Implements the Criteria interface to filter products by category.
    Requires two parameters:
     -  Product List
     -  Category

    Returns the list of the products whose category matches the given category.

    If there are no qualifying products, an emptry ArrayList is returned.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products, String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}


