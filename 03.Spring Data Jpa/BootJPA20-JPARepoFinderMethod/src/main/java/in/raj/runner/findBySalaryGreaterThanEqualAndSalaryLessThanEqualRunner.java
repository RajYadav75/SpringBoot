package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class findBySalaryGreaterThanEqualAndSalaryLessThanEqualRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.findByFeesGreaterThanEqualAndFeesLessThanEqual(400000.00,500000.00).forEach(System.out::println);
    }
}
