package in.raj.rest;

import in.raj.modal.Student;
import in.raj.service.IStudentService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student-Api")
@OpenAPIDefinition(info =
@Info(
        title = "Mini Project",
        version = "1.0",
        description = "Mini Project Crud Api supporting File Download operations",
        license = @License(name = "Raj IT", url = "http://raj.com"),
        contact = @Contact(url = "http://13.49.102.254:8115", name = "Raj", email = "Raj@gigagantic-server.com")
)
)
@CrossOrigin(origins = "http://localhost:4200")
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
    @PatchMapping("/std/{id}/{percentage}")
    public ResponseEntity<?> modifyStudentBudgetDetailsById(@PathVariable("id") int id, @PathVariable("percentage") double percentage) {
        String budgetById = studentService.updateBudgetById(id, percentage);
        return new ResponseEntity<String>(budgetById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable("id") Integer id) {
        String removeStudentById = studentService.removeStudentById(id);
        return new ResponseEntity<>(removeStudentById, HttpStatus.OK);
    }

    @DeleteMapping("/deletes/{start}/{end}")
    public ResponseEntity<?> deleteStudentByBudgetRange(@PathVariable("start") Double start, @PathVariable("end") Double end) {
        String studentRemoveByBudgetRange = studentService.removeStudentByBudgetRange(start, end);
        return new ResponseEntity<>(studentRemoveByBudgetRange, HttpStatus.OK);
    }

    @DeleteMapping("/del/{type}")
    public ResponseEntity<?> deleteStudentByType(@PathVariable("type") String type) {
        String studentByPackageType = studentService.removeStudentByPackageType(type);
        return new ResponseEntity<>(studentByPackageType, HttpStatus.OK);
    }
}
