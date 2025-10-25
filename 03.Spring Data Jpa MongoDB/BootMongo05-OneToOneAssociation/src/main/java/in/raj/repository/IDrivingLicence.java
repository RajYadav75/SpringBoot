package in.raj.repository;

import in.raj.document.DrivingLicence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDrivingLicence extends MongoRepository<DrivingLicence, String> {
}
