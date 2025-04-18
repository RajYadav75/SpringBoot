package in.raj.rest;

import in.raj.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Student-Api")
public class StudentRestController {
    @GetMapping("/report")
    public ResponseEntity<Student> showStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("Raj");
        student.setAge(22);
        student.setGender("Male");
        student.setAddress("Kanapar");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("/report1")
    public Student show() {
        Student student = new Student();
        student.setId(2);
        student.setName("Ankita");
        student.setAge(22);
        student.setGender("Female");
        student.setAddress("Harigana");
        return student;
    }
    @GetMapping("/report2")
    public ResponseEntity<List<Student>> showAll() {
        Student student1 = new Student(1,"Raj Yadav",20,"Male","Kanapar");
        Student student2 = new Student(2,"Ankita Tiwari",20,"Female","Harigana");
        Student student3 = new Student(3,"Pallavi Tripathi",20,"Female","Kanapar");
        List<Student> students = List.of(student1, student2, student3);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
