package in.raj.service.impl;

import in.raj.document.Player;
import in.raj.repository.IMedalRepo;
import in.raj.repository.IPlayerRepo;
import in.raj.repository.ISportRepo;
import in.raj.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportServiceImpl implements ISportService {
    @Autowired
    private IPlayerRepo playerRepo;
    @Autowired
    private ISportRepo sportRepo;
    @Autowired
    private IMedalRepo medalRepo;
    @Override
    public String registerPlayerWithSportAndMedals(Player player) {
        return " Player with Sport and Medal info is saved with "+playerRepo.save(player).getPId()+" id values";
    }

    @Override
    public List<Player> fetchAllPlayersInfo() {
        return playerRepo.findAll();
    }
}
