package in.raj.service;

import in.raj.entity.IPLTeam;
import in.raj.repository.IPLTeamRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IPLTeamService")
@Slf4j
public class IPLTeamManagementServiceImpl implements IPLTeamManagementService {
    @Autowired
    private IPLTeamRepo teamRepo;

    @Override
    public String createIPLTeam(IPLTeam team) {
        log.info("Create IPL Team createIPLTeam method(service)");
        Integer teamIdValue = teamRepo.save(team).getTeamID();
        return "IPLTeam created with ID: " + teamIdValue;
    }

    @Override
    public List<IPLTeam> getAllIPLTeams() {
        log.info("Get All IPL Teams getAllIPLTeams method(service)");
        return teamRepo.findAll();
    }

    @Override
    public IPLTeam getIPLTeamById(int id) {
        log.info("Get IPL Team getIPLTeamById method(service)");
        return teamRepo.findById(id).orElseThrow(()->new IllegalArgumentException("No IPL Team found with ID: " + id));
    }
}
