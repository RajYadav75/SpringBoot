package in.raj.rest;

import in.raj.model.Dost;
import in.raj.service.IDostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dost-Api")
public class RestControllerUsingException {
    @Autowired
    private IDostService service;

    @PostMapping("/register")
    public ResponseEntity<String> registerDost(@RequestBody Dost dost)throws Exception {
        String registerDost = service.registerDost(dost);
        return new ResponseEntity<>(registerDost, HttpStatus.CREATED);
    }

    @GetMapping("/showDost")
    public ResponseEntity<?> showAllDost()throws Exception {
        List<Dost> dosts = service.showAllDost();
        return new ResponseEntity<>(dosts, HttpStatus.OK);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<?> showById(@PathVariable Integer id)throws Exception {
        Dost dost = service.showDostById(id);
        return new ResponseEntity<>(dost, HttpStatus.OK);
    }

    @PutMapping("/updateDost")
    public ResponseEntity<?> updateDostData(@RequestBody  Dost dost)throws Exception {
        String updateDost = service.updateDost(dost);
        return new ResponseEntity<>(updateDost, HttpStatus.OK);

    }

    @DeleteMapping("/deleteDost")
    public ResponseEntity<?> deleteDostMethod(@PathVariable Dost dost)throws Exception {
        String deleteDost = service.deleteDost(dost.getId());
        return new ResponseEntity<>(deleteDost, HttpStatus.OK);

    }

}
