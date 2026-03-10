import java.util.ArrayList;
import java.util.List;

public class BrandFilter implements Criteria {
    
    """
    Implements the Criteria interface to filter products by brand.
    Requires three parameters:
     -  Product List
     -  Brand

    Returns the list of the products whose brand matches the given brand

    If there are no qualifying products, an emptry ArrayList is returned.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products, String brand) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand(0).equalsIgnoreCase(brand)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}