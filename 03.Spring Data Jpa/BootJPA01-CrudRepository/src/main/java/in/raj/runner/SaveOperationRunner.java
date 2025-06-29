package in.raj.runner;

import in.raj.entity.Doctor;
import in.raj.service.IDoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SaveOperationRunner implements CommandLineRunner {
    @Autowired
    private IDoctorServiceImpl doctorService;
    @Override
    public void run(String... args) throws Exception {
        try{
            Doctor doctor = new Doctor();
            doctor.setDoctorName("Deepak Kumar");
            doctor.setSpecialization("Drugs Expert");
            doctor.setIncome(300000.00);
            String resultMsg = doctorService.registerDoctor(doctor);
            System.out.println(resultMsg);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
