package massimomauro.S7L1SpringSecurityJWT.repositories;


import massimomauro.S7L1SpringSecurityJWT.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
