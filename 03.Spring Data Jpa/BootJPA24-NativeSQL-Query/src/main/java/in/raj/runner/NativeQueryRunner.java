package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NativeQueryRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        /*int count = heroineRepo.insertHeroine("Kanishk Khatun", 150000.00, "She is my best friend");
        if (count == 0) {
            System.out.println("Record Not Found");
        }else{
            System.out.println("Record Inserted");
        }*/

        int babaTable = heroineRepo.createBabaTable();
        System.out.println("babaTable created in DataBases "+babaTable);
    }
}
