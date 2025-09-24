package in.ecommerce.ecommerceapi.repository;

import in.ecommerce.ecommerceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // That's it!
    // Spring Data JPA automatically creates methods like:
    // save(), findAll(), deleteAll(), findById() and many more.
    // You don't need to write any code here.
}