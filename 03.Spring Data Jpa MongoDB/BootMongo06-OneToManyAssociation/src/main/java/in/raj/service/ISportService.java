package in.raj.service;

import in.raj.document.Player;

import java.util.List;

public interface ISportService {
    public String registerPlayerWithSportAndMedals(Player player);
    public List<Player> fetchAllPlayersInfo();
}
