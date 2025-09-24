package in.ecommerce.ecommerceapi.repository;

import in.ecommerce.ecommerceapi.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    // Custom method to get all cart items for a specific user
    List<ShoppingCart> findByUserId(Long userId);
}
