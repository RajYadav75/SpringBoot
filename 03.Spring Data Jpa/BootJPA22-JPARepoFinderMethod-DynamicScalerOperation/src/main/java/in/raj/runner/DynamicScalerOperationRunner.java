package in.raj.runner;

import in.raj.repo.IHeroineRepo;
import in.raj.view.IResultView1;
import in.raj.view.IResultView2;
import in.raj.view.IResultView3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DynamicScalerOperationRunner implements CommandLineRunner {
    @Autowired
    private IHeroineRepo heroineRepo;
    @Override
    public void run(String... args) throws Exception {
        heroineRepo.findByNameIn(List.of("Alia Bhatt","Priyanka Chopra"), IResultView1.class).forEach(view1->{
            System.out.println(view1.getName()+"   "+view1.getDescription());
        });
        System.out.println("_____________________________________________________________________________________");
        heroineRepo.findByNameIn(List.of("Alia Bhatt","Priyanka Chopra"), IResultView2.class).forEach(view2 ->{
            System.out.println(view2.getName()+"   "+ view2.getDescription()+"  "+view2.getId());
        });
        System.out.println("_____________________________________________________________________________________");
        heroineRepo.findByNameIn(List.of("Alia Bhatt","Priyanka Chopra"), IResultView3.class).forEach(view3 ->{
            System.out.println(view3.getName()+"   "+ view3.getDescription()+"   "+view3.getFees());
        });
        System.out.println("_____________________________________________________________________________________");
        System.out.println(heroineRepo.findById(33));
    }
}
