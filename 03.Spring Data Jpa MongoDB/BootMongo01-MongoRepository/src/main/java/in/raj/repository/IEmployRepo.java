package in.raj.repository;

import in.raj.document.Employ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEmployRepo extends MongoRepository<Employ, String> {
}
