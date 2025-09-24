package in.ecommerce.ecommerceapi.repository;

import in.ecommerce.ecommerceapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring Data JPA automatically creates the query to find a user by their email
    Optional<User> findByEmail(String email);
}