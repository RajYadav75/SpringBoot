package in.raj.service;

import in.raj.entity.IPLTeam;

import java.util.List;

public interface IPLTeamManagementService {
    public String createIPLTeam(IPLTeam team);
    public List<IPLTeam> getAllIPLTeams();
    public IPLTeam getIPLTeamById(int id);
}
