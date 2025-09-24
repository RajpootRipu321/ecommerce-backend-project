package in.ecommerce.ecommerceapi.service;

import in.ecommerce.ecommerceapi.model.Product;
import in.ecommerce.ecommerceapi.model.ShoppingCart;
import in.ecommerce.ecommerceapi.repository.ProductRepository;
import in.ecommerce.ecommerceapi.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ProductRepository productRepository;

    // This is your existing method for adding to the cart
    public ShoppingCart addToCart(Long userId, Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));

        ShoppingCart cartItem = new ShoppingCart();
        cartItem.setUserId(userId);
        cartItem.setProduct(product);
        cartItem.setQuantity(1);

        return shoppingCartRepository.save(cartItem);
    }

    // --- THIS IS THE NEW METHOD YOU NEED TO ADD ---
    public List<ShoppingCart> getCartItemsByUserId(Long userId) {
        return shoppingCartRepository.findByUserId(userId);
    }
}