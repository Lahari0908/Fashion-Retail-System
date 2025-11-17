package repository;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public List<Product> findByCategory(String category) {
        return products;
    }

    public void save(Product p) {
        products.add(p);
    }
}
