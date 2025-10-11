package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class ShowingHeroineUsingExampleAndSortingRunner implements CommandLineRunner {
//    @Autowired
    private IHeroinesService heroinesService;

    @Override
    public void run(String... args) throws Exception {
        Heroines heroines = new Heroines();
        List<Heroines> heroinesList = heroinesService.showHeroinesByExampleData(heroines, true,"name","fees");
        heroinesList.forEach(System.out::println);
    }
}
