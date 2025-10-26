package in.raj.repository;

import in.raj.document.Medal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMedalRepo extends MongoRepository<Medal,String> {
}
