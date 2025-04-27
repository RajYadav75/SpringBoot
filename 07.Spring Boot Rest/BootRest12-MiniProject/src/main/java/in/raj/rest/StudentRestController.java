package in.raj.rest;

import in.raj.modal.Student;
import in.raj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student-Api")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<String> registerStudent(@RequestBody Student student) {
        try{
            // Use Service
            String addedStudent = studentService.addStudent(student);
            return new ResponseEntity<>(addedStudent, HttpStatus.CREATED); //201 content created successfully
        } catch (Exception e) {
            return new ResponseEntity<>("Problem in tourist enrollment ", HttpStatus.INTERNAL_SERVER_ERROR); //500
        }
    }

    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents() {
        try {
            List<Student> allStudents = studentService.getAllStudents();
            return new ResponseEntity<>(allStudents, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>("Problem in tourist enrollment ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Integer sid) {
        Student studentById = studentService.getStudentById(sid);
        return new ResponseEntity<>(studentById, HttpStatus.OK);
    }
    @PutMapping("/student/update")
    public ResponseEntity<?> updateStudent(@RequestBody Student student) {
        String studentUpdate = studentService.updateStudent(student);
        return new ResponseEntity<>(studentUpdate, HttpStatus.OK);
    }
    @GetMapping("/student/getStudentByName/{name}")
    public ResponseEntity<?> getStudentByName(@PathVariable("name") String name) {
        List<Student> studentsByName = studentService.getStudentsByName(name);
        return new ResponseEntity<List<Student>>(studentsByName, HttpStatus.OK);
    }
}
