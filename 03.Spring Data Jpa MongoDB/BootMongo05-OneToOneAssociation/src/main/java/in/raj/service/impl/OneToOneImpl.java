package in.raj.service.impl;

import in.raj.document.DrivingLicence;
import in.raj.document.Person;
import in.raj.repository.IDrivingLicence;
import in.raj.repository.IPerson;
import in.raj.service.IOneToOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToOneImpl implements IOneToOneService {

    @Autowired
    private IPerson personRepo;
    @Autowired
    private IDrivingLicence drivingLicenceRepo;
    @Override
    public String saveDataUsingPerson(Person person) {
        String personId = personRepo.save(person).getPersonId();
        return "Person object and its associated DrivingLicense object is saved with the id value :: "+personId;
    }

    @Override
    public String saveDataUsingDrivingLicence(DrivingLicence drivingLicence) {
        String drivingLicenceId = drivingLicenceRepo.save(drivingLicence).getDrivingLicenceId();
        return "DrivingLicense object and its associated Person object is saved with the id value :: "+drivingLicenceId;
    }

    @Override
    public List<Person> fetchDataUsingPerson() {
        return personRepo.findAll();
    }

    @Override
    public List<DrivingLicence> fetchDataUsingDrivingLicence() {
        return drivingLicenceRepo.findAll();
    }
}
