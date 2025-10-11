package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/*@Component
@Transactional*/
public class GetHeroineRunner implements CommandLineRunner {
//    @Autowired
    private IHeroinesService heroinesService;
    @Override
    public void run(String... args) throws Exception {
        try {
            Heroines heroinesById = heroinesService.getHeroinesById(20);
            System.out.println(heroinesById.getClass());
            System.out.println(heroinesById.getId());
            System.out.println("_______________");
            System.out.println(heroinesById.getName());
            System.out.println(heroinesById.getClass());
            //System.out.println(heroinesById==null?"customer not found":heroinesById);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
