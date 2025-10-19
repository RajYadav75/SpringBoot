package in.raj.repository;

import in.raj.entity.MarriageSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarriageRepo extends JpaRepository<MarriageSeeker,Integer> {
}
