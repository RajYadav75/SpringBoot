package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PLSqlProcedureCallerRunner implements CommandLineRunner {
    @Autowired
    private IHeroinesService heroinesService;
    @Override
    public void run(String... args) throws Exception {
        List<Heroines> heroinesByFeesRange = heroinesService.getHeroinesByFeesRange(100.0, 2000000.00);
        for (Heroines heroine : heroinesByFeesRange) {
            System.out.println(heroine);
        }
    }
}
