package in.raj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hospital-Api")
public class HospitalRestController {

    @GetMapping("/hospital")
    public String getHospitalInfo() {
        return "We diagnosis Bone, Hair, Eyes, Fracture, Operations etc.";
    }
}
