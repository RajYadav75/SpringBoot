package in.raj.repository;

import in.raj.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {
}
