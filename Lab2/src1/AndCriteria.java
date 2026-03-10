import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    
    private Criteria criteria;
    private Criteria otherCriteria;
    
    """
    Implements the Criteria interface to combine two criteria.
    
    What if you want to filter by several different criteria? Since this AndCriteria is a Criteria, you can
    pass an AndCriteria into another AndCriteria so you can And your Criterias together.
    """

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    """
    Return an ArrayList that contains the products that satisfy both criteria.
    """
    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> firstCriteriaProducts = criteria.meetCriteria(products);
        return otherCriteria.meetCriteria(firstCriteriaProducts);
    }

}