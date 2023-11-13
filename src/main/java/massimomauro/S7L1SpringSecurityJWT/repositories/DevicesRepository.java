package massimomauro.S7L1SpringSecurityJWT.repositories;


import massimomauro.S7L1SpringSecurityJWT.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevicesRepository extends JpaRepository<Device, Integer> {
}
