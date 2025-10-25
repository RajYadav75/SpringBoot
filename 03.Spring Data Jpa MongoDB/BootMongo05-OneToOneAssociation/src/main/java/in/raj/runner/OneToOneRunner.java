package in.raj.runner;

import in.raj.document.DrivingLicence;
import in.raj.document.Person;
import in.raj.service.IOneToOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class OneToOneRunner implements CommandLineRunner {
    @Autowired
    private IOneToOneService service;
    @Override
    public void run(String... args) throws Exception {
        try {
            Person person = new Person("Raj Yadav","Kanapar",25);
            DrivingLicence licence = new DrivingLicence("Four Wheeler",LocalDate.now(),LocalDate.of(2030,1,1));
            person.setDrivingLicence(licence);
            System.out.println("-------------------------- Saving Data Using Person ------------------------");
            System.out.println(service.saveDataUsingPerson(person));
            System.out.println("-------------------------- Saved Data Using Person ------------------------");


            Person person = new Person("Ankita Tiwari","Harigana",24);
            DrivingLicence licence = new DrivingLicence("Two Wheeler", LocalDate.now(),LocalDate.of(2031,1,1));
            licence.setPerson(person);
            System.out.println("-------------------------- Saving Data Using DrivingLicence ------------------------");
            System.out.println(service.saveDataUsingDrivingLicence(licence));
            System.out.println("-------------------------- Saved Data Using DrivingLicence ------------------------");

            System.out.println("-------------------------- Fetching Data Using Person ------------------------");
            service.fetchDataUsingPerson().forEach(System.out::println);
            System.out.println("-------------------------- Fetched Data Using Person ------------------------");

            System.out.println("-------------------------- Fetching Data Using DrivingLicence ------------------------");
            service.fetchDataUsingDrivingLicence().forEach(System.out::println);
            System.out.println("-------------------------- Fetched Data Using DrivingLicence ------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
