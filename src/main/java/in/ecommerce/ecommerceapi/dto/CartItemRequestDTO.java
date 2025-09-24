package in.ecommerce.ecommerceapi.dto;

import lombok.Data;

@Data
public class CartItemRequestDTO {
    private Long userId;
    private Long productId;
    private int quantity;
}
