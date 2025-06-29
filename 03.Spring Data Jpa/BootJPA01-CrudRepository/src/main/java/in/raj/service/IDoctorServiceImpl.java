package in.raj.service;

import in.raj.entity.Doctor;
import in.raj.repository.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDoctorServiceImpl implements IDoctorService {
    @Autowired
    private IDoctorRepo doctorRepo;
    @Override
    public String registerDoctor(Doctor doctor) {
        System.out.println("Doctor id before save :: "+doctor.getDoctorId());
        Doctor doc = doctorRepo.save(doctor);
        return "Doctor object is save with id value :: "+doc.getDoctorId();
    }
}
