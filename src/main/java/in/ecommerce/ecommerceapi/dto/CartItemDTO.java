package in.ecommerce.ecommerceapi.dto;

import lombok.Data; // <-- Import statement
import java.math.BigDecimal;

@Data // <-- The missing annotation
public class CartItemDTO {
    private String productName;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal subtotal;
}