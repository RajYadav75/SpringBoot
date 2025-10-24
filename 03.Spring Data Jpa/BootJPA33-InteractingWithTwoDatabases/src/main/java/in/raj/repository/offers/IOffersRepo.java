package in.raj.repository.offers;

import in.raj.entity.offers.Offers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOffersRepo extends JpaRepository<Offers, Integer> {
}
