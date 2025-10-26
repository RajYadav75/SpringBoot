package in.raj.repository;

import in.raj.document.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPlayerRepo extends MongoRepository<Player,String> {
}
