import java.util.ArrayList;
import java.util.List;

public class PriceFilter implements Criteria {
    
    """
    Implements the Criteria interface to filter products by price.
    Requires three parameters:
     -  Product List
     -  Minimum Price
     -  Maximum price

    Returns the list of the products whose prices range between those two values.

    If there are no qualifying products, an emptry ArrayList is returned.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products, double minPrice, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < maxPrice && product.getPrice() > minPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}


