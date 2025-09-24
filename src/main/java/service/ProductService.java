// in package in.ecommerce.ecommerceapi.service
package in.ecommerce.ecommerceapi.service;
import in.ecommerce.ecommerceapi.model.Product;
import in.ecommerce.ecommerceapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}