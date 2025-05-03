package in.raj.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Raj-Api")
@Tag(name = "Raj",description = "This is raj Application API")
public class RajRestApp {
    @GetMapping("/")
    @Operation(summary = "get Id & Name",description = "get the value from RequestParam")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "successful operation generated")
    })
    /*
    * http://localhost:8115/BootRest20/swagger-ui/index.html
    */
    public ResponseEntity<?> showData(@RequestParam Integer id,@RequestParam String name) {
        return new ResponseEntity<>("This is raj Application API "+id+" "+name, HttpStatus.OK);
    }

}
