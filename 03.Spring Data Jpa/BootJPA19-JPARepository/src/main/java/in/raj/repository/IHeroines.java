package in.raj.repository;

import in.raj.entity.Heroines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHeroines extends JpaRepository<Heroines, Integer> {
}
