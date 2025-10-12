package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class findByNameInIgnoreCaseOrNameContainingIgnoreCaseRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.findByNameInIgnoreCaseOrNameContainingIgnoreCase(List.of("Huma Qureshi","Vidya Balan"),"Q").forEach(System.out::println);
    }
}
