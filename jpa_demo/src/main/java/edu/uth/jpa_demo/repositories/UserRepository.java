package edu.uth.jpa_demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.uth.jpa_demo.models.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
