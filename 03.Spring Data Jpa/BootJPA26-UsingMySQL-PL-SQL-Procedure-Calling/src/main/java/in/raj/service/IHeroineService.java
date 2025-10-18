package in.raj.service;

import in.raj.entity.Heroines;

import java.util.List;

public interface IHeroineService {
    public List<Heroines> getHeroinesByFeesRange(Double startFees, Double endFees);
}
