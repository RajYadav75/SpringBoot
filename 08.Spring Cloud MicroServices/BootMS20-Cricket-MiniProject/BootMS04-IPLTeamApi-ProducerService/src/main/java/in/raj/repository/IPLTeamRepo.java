package in.raj.repository;

import in.raj.entity.IPLTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPLTeamRepo extends JpaRepository<IPLTeam, Integer> {
}
