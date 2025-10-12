package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class FindByNameLikeIgnoreCaseRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.findByNameLikeIgnoreCase("%i%").forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        heroineRepo.findByNameLikeIgnoreCase("%i").forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        heroineRepo.findByNameLikeIgnoreCase("i%").forEach(System.out::println);
    }
}
