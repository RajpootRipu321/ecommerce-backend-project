package in.ecommerce.ecommerceapi;

import in.ecommerce.ecommerceapi.model.Product;
import in.ecommerce.ecommerceapi.repository.ProductRepository;
import in.ecommerce.ecommerceapi.repository.ShoppingCartRepository; // 1. Add this import
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;

@SpringBootApplication
public class EcommerceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApiApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductRepository productRepository, ShoppingCartRepository shoppingCartRepository) { // 2. Add ShoppingCartRepository here
        return args -> {
            // 3. Delete all existing cart items FIRST
            shoppingCartRepository.deleteAll();

            // 4. THEN delete all existing products
            productRepository.deleteAll();

            Product product1 = new Product();
            product1.setName("Wireless Bluetooth Headphones");
            product1.setDescription("High-fidelity audio with deep bass and noise cancellation.");
            product1.setPrice(new BigDecimal("2499.00"));
            product1.setImageUrl("https://images.unsplash.com/photo-1505740420928-5e560c06d30e?q=80&w=2070");
            productRepository.save(product1);

            Product product2 = new Product();
            product2.setName("Smart Fitness Watch");
            product2.setDescription("Track your steps, heart rate, and sleep patterns with this stylish watch.");
            product2.setPrice(new BigDecimal("4999.00"));
            product2.setImageUrl("https://images.unsplash.com/photo-1523275335684-37898b6baf30?q=80&w=1999");
            productRepository.save(product2);

            System.out.println("-----> Sample products have been loaded into the database.");
        };
    }
}