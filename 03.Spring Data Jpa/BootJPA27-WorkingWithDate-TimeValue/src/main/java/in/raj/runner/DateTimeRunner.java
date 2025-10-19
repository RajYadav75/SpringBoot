package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class DateTimeRunner implements CommandLineRunner {
    @Autowired
    private IHeroinesService heroinesService;
    @Override
    public void run(String... args) throws Exception {
        Heroines heroines = new Heroines();
        heroines.setName("Pallavi Tripathi");
        heroines.setFees(950000.00);
        heroines.setDescription("She is mine ");
        heroines.setLt(LocalTime.now());
        heroines.setLd(LocalDate.now());
        heroines.setLdt(LocalDateTime.of(2000,03,21,10,12,20));
        //Todo-: Saving the object
        String printValue = heroinesService.registerHeroines(heroines);
        System.out.println(printValue);

        heroinesService.getAllHeroines().forEach(System.out::println);
    }
}
