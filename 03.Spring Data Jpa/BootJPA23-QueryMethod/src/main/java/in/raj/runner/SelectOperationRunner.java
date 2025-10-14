package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.repo.IHeroineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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
        System.out.println("============================================");
        List<Object[]> heroinesData = heroineRepo.getHeroinesData("Ankita Tiwari", "Pallavi Tripathi");
        heroinesData.forEach(row->{
            for(Object value:row){
                System.out.print(value+" ");
            }
            System.out.println();
        });
        System.out.println("============================================");
        heroineRepo.getHeroinesNamesUsingFchar("A%").forEach(System.out::println);
        /*//TODO- Or
        List<String> heroinesNamesUsingFchar = heroineRepo.getHeroinesNamesUsingFchar("A%");
        heroinesNamesUsingFchar.forEach(char->{
            System.out.println(char);
        });*/

        System.out.println("============================================");
        Heroines ankitaTiwari = heroineRepo.getHeroinesDescription("Ankita Tiwari");
        System.out.println(ankitaTiwari );
        System.out.println("============================================");
        Object ankitaTiwari1 = heroineRepo.getHeroinesDataUsingName("Ankita Tiwari");
        Object[] ankitaTiwari2 = (Object[]) ankitaTiwari1;
        System.out.println("Heroines Details :: "+ Arrays.toString(ankitaTiwari2));
        System.out.println("============================================");
        System.out.println("Heroine Details :: "+heroineRepo.fetchHeroinesNameUsingFees(780000));
        System.out.println("============================================");
        System.out.println("Heroines Count :: "+heroineRepo.fetchAllHeroinesCountUsingFees());
        System.out.println("============================================");
        Object []obj = (Object[]) heroineRepo.fetchHeroinesAggregateData();
        System.out.println("Heroines Count :: "+obj[0]);
        System.out.println("Heroines maxFees :: "+obj[1]);
        System.out.println("Heroines minFees :: "+obj[2]);
        System.out.println("Heroines avgFees :: "+obj[3]);
        System.out.println("Heroines sumFees :: "+obj[4]);
    }
}
