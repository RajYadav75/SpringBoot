package in.raj.repository;

import in.raj.document.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPerson extends MongoRepository<Person, String> {
}
