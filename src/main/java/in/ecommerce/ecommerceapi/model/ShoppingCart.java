package in.ecommerce.ecommerceapi.model;

import jakarta.persistence.*;
import lombok.Data; // <-- Import statement

@Data // <-- The missing annotation
@Entity
@Table(name = "shopping_cart_items")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
}