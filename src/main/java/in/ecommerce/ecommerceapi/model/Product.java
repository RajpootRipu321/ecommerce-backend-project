package in.ecommerce.ecommerceapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor; // 1. Add this import
import lombok.Data;
import lombok.NoArgsConstructor; // 2. Add this import

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor // 3. Add this annotation
@AllArgsConstructor // 4. Add this annotation
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
    private String imageUrl;
}