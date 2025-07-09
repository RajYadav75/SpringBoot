package in.raj.runner;

import in.raj.entity.Teacher;
import in.raj.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaveTeacherRunner implements CommandLineRunner {
    @Autowired
    private ITeacherService teacherService;
    @Override
    public void run(String... args) throws Exception {
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Raj");
        teacher1.setLastName("Yadav");
        teacher1.setEmail("teacherRajYadav@gmail.com");
        Teacher teacher2 = new Teacher();
        teacher2.setFirstName("Ashok");
        teacher2.setLastName("Sir");
        teacher2.setEmail("ashokIt@gmail.com");
        Teacher teacher3 = new Teacher();
        teacher3.setFirstName("Natu");
        teacher3.setLastName("Sir");
        teacher3.setEmail("teachernataraz@gmail.com");
        Teacher teacher4 = new Teacher();
        teacher4.setFirstName("keshav");
        teacher4.setLastName("Yadav");
        teacher4.setEmail("teacherkeshavYadav@gmail.com");
        Teacher teacher5 = new Teacher();
        teacher5.setFirstName("durga ");
        teacher5.setLastName("Sir");
        teacher5.setEmail("teacherdurgasoft@gmail.com");
        Teacher teacher6 = new Teacher();
        teacher6.setFirstName("veda");
        teacher6.setLastName("sir");
        teacher6.setEmail("teachervedasir@gmail.com");
        String addTeacher = teacherService.addTeacher(List.of(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));
        System.out.println(addTeacher);
    }
}
