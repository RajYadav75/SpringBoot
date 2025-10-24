package in.raj.repository.prod;

import in.raj.entity.prod.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
