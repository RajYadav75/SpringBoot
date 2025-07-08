package in.raj.runner;

import in.raj.entity.Friends;
import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DeleteByIdRunner implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println(friendService.deleteFriendById(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
