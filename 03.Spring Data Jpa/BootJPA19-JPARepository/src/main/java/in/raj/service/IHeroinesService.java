package in.raj.service;

import in.raj.entity.Heroines;

import java.util.List;

public interface IHeroinesService {
    public Heroines addHeroines(Heroines heroines);
    public Heroines getHeroinesById(int id);
    public List<Heroines> showHeroinesByExampleData(Heroines atrs,boolean ascOrder,String ...properties);
    public String deleteHeroinesById(List<Integer> ids);
    public String groupHeroinesRegistration(List<Heroines> heroines);
}
