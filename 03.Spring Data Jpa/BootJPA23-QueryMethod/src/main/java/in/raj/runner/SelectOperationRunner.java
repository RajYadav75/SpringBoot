package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SelectOperationRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.getAllHeroines().forEach(System.out::println);
        System.out.println("============================================");
        heroineRepo.getHeroinesByFeesRange(670000,800000).forEach(System.out::println);
        System.out.println("============================================");
        heroineRepo.getHeroinesByFeesRange2(670000,800000).forEach(System.out::println);
    }
}
