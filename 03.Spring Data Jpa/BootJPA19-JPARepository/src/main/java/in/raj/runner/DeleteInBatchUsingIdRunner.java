package in.raj.runner;

import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class DeleteInBatchUsingIdRunner implements CommandLineRunner {
//    @Autowired
    private IHeroinesService heroinesService;
    @Override
    public void run(String... args) throws Exception {
        try {
            String msg = heroinesService.deleteHeroinesById(Arrays.asList(20, 14, null));
            System.out.println(msg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
