package in.raj.service;


import in.raj.entity.Heroines;

import java.util.List;

public interface IHeroinesService {
    public String  registerHeroines(Heroines heroines);
    public List<Heroines> getAllHeroines();
}
