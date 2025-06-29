package in.raj.runner;

import in.raj.entity.Student;
import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaveAllRunner implements CommandLineRunner {
    @Autowired
    private IStudentService studentService;
    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setFirstName("Raj");
        student.setLastName("Yadav");
        student.setFullName(student.getFirstName() + " " + student.getLastName());
        student.setEmail("rajyadav@gmail.com");
        student.setPassword("rajYadav@123");
        student.setMobileNumber(8156846165L);

        Student student1 = new Student();
        student1.setFirstName("Ankita");
        student1.setLastName("Tiwari");
        student1.setFullName(student1.getFirstName() + " " + student1.getLastName());
        student1.setEmail(student1.getFirstName()+student1.getLastName()+"@gmail.com");
        student1.setPassword(student1.getFirstName()+student1.getLastName()+"@123");
        student1.setMobileNumber(63649841516L);

        Student student2 = new Student();
        student2.setFirstName("Deepak");
        student2.setLastName("Kumar");
        student2.setFullName(student2.getFirstName() + " " + student2.getLastName());
        student2.setEmail(student2.getFirstName() + student2.getLastName()+"@gmail.com");
        student2.setPassword(student2.getFirstName() + student2.getLastName()+"@123");
        student2.setMobileNumber(81156115643L);

        Student student3 = new Student();
        student3.setFirstName("Ambrikesh");
        student3.setLastName("Gour");
        student3.setFullName(student3.getFirstName() + " " + student3.getLastName());
        student3.setEmail(student3.getFirstName() + student3.getLastName()+"@gmail.com");
        student3.setPassword(student3.getFirstName() + student3.getLastName()+"@123");
        student3.setMobileNumber(985423641572L);

        Student student4 = new Student();
        student4.setFirstName("Baba");
        student4.setLastName("Yaga");
        student4.setFullName(student4.getFirstName() + " " + student4.getLastName());
        student4.setEmail(student4.getFirstName()+ student4.getLastName()+"@gmail.com");
        student4.setPassword(student4.getFirstName()+ student4.getLastName()+"@123");
        student4.setMobileNumber(98564251358L);

        String storedStudentData = studentService.registerGroupOfStudents(List.of(student,student1, student2, student3, student4));
        System.out.println(storedStudentData);

    }
}
