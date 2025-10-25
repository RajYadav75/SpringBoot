package in.raj.service;

import in.raj.document.DrivingLicence;
import in.raj.document.Person;

import java.util.List;

public interface IOneToOneService {
    public String saveDataUsingPerson(Person person);
    public String saveDataUsingDrivingLicence(DrivingLicence drivingLicence);

    public List<Person> fetchDataUsingPerson();
    public List<DrivingLicence> fetchDataUsingDrivingLicence();
}
