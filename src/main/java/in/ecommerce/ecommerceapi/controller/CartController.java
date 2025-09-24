package in.ecommerce.ecommerceapi.controller;

import in.ecommerce.ecommerceapi.dto.AddToCartRequest;
import in.ecommerce.ecommerceapi.model.ShoppingCart;
import in.ecommerce.ecommerceapi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // This is your existing endpoint for adding items
    @PostMapping("/add")
    public ResponseEntity<ShoppingCart> addToCart(@RequestBody AddToCartRequest addToCartRequest) {
        try {
            ShoppingCart cartItem = cartService.addToCart(addToCartRequest.getUserId(), addToCartRequest.getProductId());
            return ResponseEntity.ok(cartItem);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // --- THIS IS THE NEW ENDPOINT TO GET CART ITEMS ---
    @GetMapping("/{userId}")
    public ResponseEntity<List<ShoppingCart>> getCartItems(@PathVariable Long userId) {
        List<ShoppingCart> cartItems = cartService.getCartItemsByUserId(userId);
        return ResponseEntity.ok(cartItems);
    }
}