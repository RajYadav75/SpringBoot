package in.raj.repository;

import in.raj.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface IDoctorRepo extends CrudRepository<
        Doctor,  // Entity Class Name
        Integer
        > // @ID property type
{

}
