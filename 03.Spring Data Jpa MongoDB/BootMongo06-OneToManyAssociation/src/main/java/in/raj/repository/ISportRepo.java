package in.raj.repository;

import in.raj.document.Sport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISportRepo extends MongoRepository<Sport,String> {
}
