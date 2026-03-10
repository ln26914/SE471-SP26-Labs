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

    """
    Implements the Cirteria interface to filter products by category. Two matching categories
    can be specified.

    Requires three parameters:
     -  Product List
     -  Category 1
     -  Category 2

    Returns the list of the products that are in either Category 1 or Category 2.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products, String category1, String category2) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category1)) {
                filteredProducts.add(product);
            }
            if(product.getCategory().equalsIgnoreCase(category2)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    // If I had more time, i would implement a way to filter by a list of categories.
}