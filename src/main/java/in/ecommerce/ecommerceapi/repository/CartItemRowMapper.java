package in.ecommerce.ecommerceapi.repository;

import in.ecommerce.ecommerceapi.dto.CartItemDTO;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartItemRowMapper implements RowMapper<CartItemDTO> {
    @Override
    public CartItemDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        CartItemDTO item = new CartItemDTO();
        item.setProductName(rs.getString("product_name"));
        item.setQuantity(rs.getInt("quantity"));
        item.setPricePerUnit(rs.getBigDecimal("price_per_unit"));
        item.setSubtotal(rs.getBigDecimal("subtotal"));
        return item;
    }
}