package in.raj.service;

import in.raj.entity.Heroines;

import java.util.List;

public interface IHeroinesService {
    public List<Heroines> getHeroinesByFeesRange(Double startFees, Double endFees);
}
