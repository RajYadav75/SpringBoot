package in.raj.repository;

import in.raj.entity.IPLPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPLPlayerRepo extends JpaRepository<IPLPlayer, Integer> {
}
