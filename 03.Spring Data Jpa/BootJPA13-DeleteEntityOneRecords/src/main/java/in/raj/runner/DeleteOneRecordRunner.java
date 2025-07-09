package in.raj.runner;

import in.raj.entity.Friends;
import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DeleteOneRecordRunner implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        try {
            Friends friends = new Friends();
            friends.setId(3);
            System.out.println(friendService.deleteFriend(friends));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
