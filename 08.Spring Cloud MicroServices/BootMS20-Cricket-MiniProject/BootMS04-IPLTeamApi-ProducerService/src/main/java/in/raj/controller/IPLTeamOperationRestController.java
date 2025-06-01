package in.raj.controller;

import in.raj.entity.IPLTeam;
import in.raj.service.IPLTeamManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/team-api")
public class IPLTeamOperationRestController {
    @Autowired
    private IPLTeamManagementService teamService;

    @PostMapping("/register")
    public ResponseEntity<String> registerTeam(@RequestBody IPLTeam team) {
        try {
            // Use service
            String iplTeam = teamService.createIPLTeam(team);
            log.info("Register Team method -(Controller)");
            return new ResponseEntity<>(iplTeam, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Problem in Register Team method -(Controller)" + e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> showAllTeam() {
        try {
            //Use Service
            List<IPLTeam> allIPLTeams = teamService.getAllIPLTeams();
            log.info("Show All Team method -(Controller)");
            return new ResponseEntity<>(allIPLTeams, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Problem in Show All Team method -(Controller)" + e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findTeamById(@PathVariable int id) {
        try {
            // Use Service
            IPLTeam iplTeamById = teamService.getIPLTeamById(id);
            log.info("Find Team method -(Controller)");
            return new ResponseEntity<>(iplTeamById, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Problem in FindBYID Team method -(Controller)" + e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
