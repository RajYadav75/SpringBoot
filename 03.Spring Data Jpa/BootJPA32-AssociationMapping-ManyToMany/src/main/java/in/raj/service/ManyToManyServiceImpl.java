package in.raj.service;

import in.raj.entity.Doctor;
import in.raj.entity.Patient;
import in.raj.repository.IDoctorRepo;
import in.raj.repository.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManyToManyServiceImpl implements IManyToMany{
    @Autowired
    private IDoctorRepo doctorRepo;
    @Autowired
    private IPatientRepo patientRepo;
    @Override
    public void saveDataUsingDoctor() {
        Doctor doctor1 = new Doctor("Raj Yadav","Physican");
        Doctor doctor2 = new Doctor("Baba Yaga","Ortho");

        Patient patient1 = new Patient("Karan",40,"Heart");
        Patient patient2 = new Patient("Ramesh",41,"Kidney");
        Patient patient3 = new Patient("Rakesh",40,"Blood Pressure");
        Patient patient4 = new Patient("Suraj",38,"Stomach");
        //TODO:- add patients to doctors
        doctor1.setPatients(List.of(patient1,patient2));
        doctor2.setPatients(List.of(patient3,patient4));
        //TODO:- add Doctors to Patients
        patient1.setDoctors(List.of(doctor1));
        patient2.setDoctors(List.of(doctor1));
        patient3.setDoctors(List.of(doctor1,doctor2));
        patient4.setDoctors(List.of(doctor2));

        doctorRepo.saveAll(List.of(doctor1,doctor2));
        System.out.println("Doctor and their patient are saved");
    }

    @Override
    public void saveDataUsingPatient() {
        Doctor doctor1 = new Doctor("Ankita Tiwari","Physican");
        Doctor doctor2 = new Doctor("Pallavi Tripathi","Ortho");

        Patient patient1 = new Patient("Kiran",40,"Heart");
        Patient patient2 = new Patient("Rimi",41,"Kidney");
        Patient patient3 = new Patient("Raheem",40,"Blood Pressure");
        Patient patient4 = new Patient("John",38,"Stomach");

        //TODO:- Add Patients to Doctors
        List<Patient> doc1Patients = new ArrayList<>();
        doc1Patients.add(patient1);
        doc1Patients.add(patient2);
        doc1Patients.add(patient3);
        doctor1.setPatients(doc1Patients);
        List<Patient> doc2Patients = new ArrayList<>();
        doc2Patients.add(patient3);
        doc2Patients.add(patient4);
        doctor2.setPatients(doc2Patients);

        //TODO:- Add Doctors to Patients
        List<Doctor> pat1Doctors = new ArrayList<>();
        pat1Doctors.add(doctor1);
        patient1.setDoctors(pat1Doctors);
        List<Doctor> pat2Doctors = new ArrayList<>();
        pat2Doctors.add(doctor2);
        patient2.setDoctors(pat2Doctors);
        List<Doctor> pat3Doctors = new ArrayList<>();
        pat3Doctors.add(doctor1);
        pat3Doctors.add(doctor2);
        patient3.setDoctors(pat3Doctors);
        List<Doctor> pat4Doctors = new ArrayList<>();
        pat4Doctors.add(doctor2);
        patient4.setDoctors(pat4Doctors);

        patientRepo.saveAll(List.of(patient1,patient2,patient3,patient4));
        System.out.println("Patients and their Doctors Info is saved");

    }

    @Override
    public void getDataUsingDoctor() {
        List<Doctor> all = doctorRepo.findAll();
        all.forEach(doctor -> {
            System.out.println("Parent:: "+doctor);
            //TODO:- Get patient of a Doctor
            List<Patient> patients = doctor.getPatients();
            patients.forEach(patient -> {
                System.out.println("Child:: "+patient);
            });
            System.out.println("____________________");
        });

    }

    @Override
    public void getDataUsingPatient() {
        List<Patient> all = patientRepo.findAll();
        all.forEach(patient -> {
            System.out.println("Child:: "+patient);
            //TODO:- Get Doctors of Each Patient
            List<Doctor> doctors = patient.getDoctors();
            doctors.forEach(doctor -> {
                System.out.println("Parent:: "+doctor);
            });
            System.out.println("...........................");
        });
    }
}
