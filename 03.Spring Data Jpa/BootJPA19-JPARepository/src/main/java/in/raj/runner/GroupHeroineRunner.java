package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupHeroineRunner implements CommandLineRunner {
    @Autowired
    private IHeroinesService heroinesService;
    @Override
    public void run(String... args) throws Exception {
        try {
            Heroines heroines = new Heroines();
            heroines.setName("Ankita Tiwari");
            heroines.setFees(780000.00);
            heroines.setDescription("She is my girlfriend and i always love him");
            Heroines heroines1 = new Heroines();
            heroines1.setName("Pallavi Tripathi");
            heroines1.setFees(680000.00);
            heroines1.setDescription("She is my girlfriend and i always love him");
            String groupingHeroines = heroinesService.groupHeroinesRegistration(List.of(heroines, heroines1));
            System.out.println(groupingHeroines);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
