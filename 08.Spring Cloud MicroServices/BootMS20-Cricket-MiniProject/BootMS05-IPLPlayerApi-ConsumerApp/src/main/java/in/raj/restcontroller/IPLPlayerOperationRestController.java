package in.raj.restcontroller;

import in.raj.client.ConsumingProviderMSIPLTeam;
import in.raj.entity.IPLPlayer;
import in.raj.entity.IPLTeam;
import in.raj.service.IPLPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player-api")
public class IPLPlayerOperationRestController {
    @Autowired
    private ConsumingProviderMSIPLTeam playerService;
    @Autowired
    private IPLPlayerService service;

    @PostMapping("/save")
    public ResponseEntity<String> registerPlayer(@RequestBody IPLPlayer player) {
        //TODO:- Get Player team Id
        Integer teamID = player.getTeam().getTeamID();
        //TODO:- Get IPLTeam object from Target MS (IPLTeamMs)
        IPLTeam iplTeamById = playerService.getIPLTeamById(teamID);// MicroService IntraCommunication
        //TODO:- Set Team object to Player object
        player.setTeam(iplTeamById);
        try{
            //Use services
            String plyer = service.addPlayer(player);
            return new ResponseEntity<>(plyer, HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> showAllPlayer() {
        try{
            //use services
            List<IPLPlayer> allPlayers = service.getAllPlayers();
            return new ResponseEntity<List<IPLPlayer>>(allPlayers,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> showPlayerById(@PathVariable Integer id) {
        try{
            // use service
            IPLPlayer playerById = service.getPlayerById(id);
            return new ResponseEntity<IPLPlayer>(playerById,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
