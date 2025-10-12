package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
public class FindByHeroineNameEqualsRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.findBynameEquals("Alia Bhatt").forEach(System.out::println);
    }
}
