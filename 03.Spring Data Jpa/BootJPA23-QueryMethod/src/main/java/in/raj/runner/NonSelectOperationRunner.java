package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NonSelectOperationRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        int count = heroineRepo.updateHeroinesFeesByName(10.00, "Ankita Tiwari", "Pallavi Tripathi");
        System.out.println("Number of Heroines that are affected: " + count);

        int deleteCount = heroineRepo.deleteHeroinesBetweenId(1, 5);
        System.out.println("Number of Heroines that are affected: " + deleteCount);
    }
}
