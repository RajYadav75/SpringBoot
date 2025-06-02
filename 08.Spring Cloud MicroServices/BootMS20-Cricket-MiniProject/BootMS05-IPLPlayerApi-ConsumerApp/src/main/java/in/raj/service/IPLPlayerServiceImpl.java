package in.raj.service;

import in.raj.entity.IPLPlayer;
import in.raj.repository.IPLPlayerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PlayerService")
@Slf4j
public class IPLPlayerServiceImpl implements IPLPlayerService {
    @Autowired
    private IPLPlayerRepo playerRepo;
    @Override
    public List<IPLPlayer> getAllPlayers() {
        log.info("Finding all players method Executed");
        return playerRepo.findAll();
    }

    @Override
    public IPLPlayer getPlayerById(int id) {
        log.info("Finding player method Executed");
        Optional<IPLPlayer> playerById = playerRepo.findById(id);
        if (playerById.isPresent()) {
            log.info("findPlayerById(-) --player found and returned");
            return playerById.get();
        }
        log.error("Problem in finding the player");
        throw new IllegalArgumentException("Player not found");
    }

    @Override
    public String addPlayer(IPLPlayer newPlayer) {
        log.info("Adding player method Executed");
        Integer playerId = playerRepo.save(newPlayer).getPlayerId();
        return "Player is registered with the Id ::"+playerId;
    }
}
