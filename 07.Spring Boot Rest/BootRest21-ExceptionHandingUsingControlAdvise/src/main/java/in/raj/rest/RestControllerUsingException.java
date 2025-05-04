package in.raj.rest;

import in.raj.model.Dost;
import in.raj.service.IDostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dost-Api")
@Tag(name = "Dost",description = "This is dost Api")
public class RestControllerUsingException {
    @Autowired
    private IDostService service;

    @PostMapping("/register")
    @Operation(
            summary = "save the dost data",
            description = "Here is a method which can save the data"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successfull operation created")
    })
    public ResponseEntity<String> registerDost(@RequestBody Dost dost)throws Exception {
        String registerDost = service.registerDost(dost);
        return new ResponseEntity<>(registerDost, HttpStatus.CREATED);
    }

    @GetMapping("/showDost")
    @Operation(
            summary = "Get the  dost data",
            description = "Here is a method which can get the data"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successfull operation getting")
    })
    public ResponseEntity<?> showAllDost()throws Exception {
        List<Dost> dosts = service.showAllDost();
        return new ResponseEntity<>(dosts, HttpStatus.OK);
    }

    @GetMapping("/show/{id}")
    @Operation(
            summary = "show  data using id",
            description = "Here is a method which can get the data using id"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successfull operation id getting")
    })
    public ResponseEntity<?> showById(@PathVariable Integer id)throws Exception {
        Dost dost = service.showDostById(id);
        return new ResponseEntity<>(dost, HttpStatus.OK);
    }

    @PutMapping("/updateDost")
    @Operation(
            summary = "update the dost data",
            description = "Here is a method which can update the data"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successfull operation updated")
    })
    public ResponseEntity<?> updateDostData(@RequestBody  Dost dost)throws Exception {
        String updateDost = service.updateDost(dost);
        return new ResponseEntity<>(updateDost, HttpStatus.OK);

    }

    @DeleteMapping("/deleteDost")
    @Operation(
            summary = "delete the dost data",
            description = "Here is a method which can delete the data"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successfull operation deleted")
    })
    public ResponseEntity<?> deleteDostMethod(@PathVariable Dost dost)throws Exception {
        String deleteDost = service.deleteDost(dost.getId());
        return new ResponseEntity<>(deleteDost, HttpStatus.OK);

    }

}
