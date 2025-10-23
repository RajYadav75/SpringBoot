package in.raj.repository;

import in.raj.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber,Integer>{
}
