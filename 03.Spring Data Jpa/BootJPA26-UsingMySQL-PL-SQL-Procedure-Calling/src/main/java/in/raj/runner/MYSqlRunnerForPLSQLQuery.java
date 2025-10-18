package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MYSqlRunnerForPLSQLQuery implements CommandLineRunner {
    @Autowired
    private IHeroineService heroineService;
    @Override
    public void run(String... args) throws Exception {
        List<Heroines> heroinesByFeesRange = heroineService.getHeroinesByFeesRange(50.00, 100.00);
        for (Heroines heroine : heroinesByFeesRange) {
            System.out.println(heroine);
        }
    }
}
