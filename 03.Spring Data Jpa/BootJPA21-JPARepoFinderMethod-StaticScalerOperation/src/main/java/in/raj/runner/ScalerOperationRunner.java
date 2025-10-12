package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ScalerOperationRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(heroineRepo.getClass()+"----------"+ Arrays.toString(heroineRepo.getClass().getInterfaces()));
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");
//        heroineRepo.findByFees(450000.00).forEach(System.out::println);
        heroineRepo.findByFees(450000.00).forEach(view->{
            System.out.println(view.getClass()+"->->->->->->->->->->"+Arrays.toString(view.getClass().getInterfaces()));
            System.out.println(view.getName());
            System.out.println(view.getDescription());
        });
    }
}
