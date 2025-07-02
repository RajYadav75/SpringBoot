package in.raj.runner;

import in.raj.entity.Student;
import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FindAllRunner implements CommandLineRunner {
    @Autowired
    private IStudentService  studentService;
    @Override
    public void run(String... args) throws Exception {
        try{
            Iterable<Student> allStudents = studentService.findAllStudents();
            allStudents.forEach(student -> {
                System.out.println(student); //Java 8 feature ForEach(-) Method
            });
            System.out.println("------------------------------------");//OR
            allStudents.forEach(student -> System.out.println(student));//Improved Java 8 feature ForEach(-) Method
            System.out.println("------------------------------------");//OR
            allStudents.forEach(System.out::println); //Java 8 ForEach(-) + static method reference
            System.out.println("------------------------------------");//OR
            for (Student student : allStudents) {
                System.out.println(student);                 // Java 5 enhanced For Loop
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
