import java.util.ArrayList;
import java.util.List;

public class RatingFilter implements Criteria {
    
    """
    Implements the Criteria interface to filter products by Rating.
    Requires three parameters:
     -  Product List
     -  Minimum Rating
     -  Maximum Rating (Optional)

    Returns the list of the products whose ratings range between those two values.
    If one rating is provided, returns the list of products whose ratings is **AT LEAST** 
    the given rating.

    If there are no qualifying products, an emptry ArrayList is returned.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products, double minRating, double maxRating) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if(product.getRating() >= minRating && product.getRating() <= maxRating) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }


    """
    This is an overloaded method. If the third parameter maxRating is not provided,
    this method will be called instead.
    
    Implements the Criteria Interface to filter products by Rating.
    Requires two parameters:
     -  Product List
     -  Minimum Rating
    
    Returns the list of the products whose rating is greater than or equal to the 
    given rating.

    Since most customers are looking for products with a rating at least a certain value,
    this method streamlines the process.
    """
    @Overload
    public List<Product> meetCriteria(List<Product> products, double minRating) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if(product.getRating() >= minRating) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}


