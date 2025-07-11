package in.raj.runner;

import in.raj.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Sorting implements CommandLineRunner {
    @Autowired
    private ITeacherService teacherService;
    @Override
    public void run(String... args) throws Exception {
        teacherService.showTeacherBySorting(true,"firstName").forEach(System.out::println);
        System.out.println("-*-*--*-**-*-***-*-**-*-*-*-**--**-*-*-*--*-*-*-*--*-*-*-*--***-----******--------**--***-*--*");
        teacherService.showTeacherBySorting(false,"email","lastName").forEach(System.out::println);
    }
}
