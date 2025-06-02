package in.raj.service;

import in.raj.entity.IPLPlayer;

import java.util.List;

public interface IPLPlayerService {
    public List<IPLPlayer> getAllPlayers();
    public IPLPlayer getPlayerById(int id);
    public String addPlayer(IPLPlayer newPlayer);
}
