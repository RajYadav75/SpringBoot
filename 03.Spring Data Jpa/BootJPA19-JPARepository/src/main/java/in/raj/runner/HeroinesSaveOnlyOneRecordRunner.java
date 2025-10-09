package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class HeroinesSaveOnlyOneRecordRunner implements CommandLineRunner {
//    @Autowired
    private IHeroinesService  heroinesService;
    @Override
    public void run(String... args) throws Exception {
        Heroines heroines1 = new Heroines();
        heroines1.setName("Deepika Padukone");
        heroines1.setFees(450000.00);
        heroines1.setDescription("She is a very popular Heroine in Bollywood");
        Heroines h1 = heroinesService.addHeroines(heroines1);
        System.out.println("✅ Record Saved: " +h1);
    }
}
