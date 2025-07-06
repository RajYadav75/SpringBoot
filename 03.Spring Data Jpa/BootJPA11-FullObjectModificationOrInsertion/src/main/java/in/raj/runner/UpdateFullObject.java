package in.raj.runner;

import in.raj.entity.Friends;
import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UpdateFullObject implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        Friends friends = new Friends();
        friends.setId(1);
        friends.setName("Raj");
        friends.setEmail("rajyadavengi@gmail.com");
        friends.setPhno(985674123652L);
        friends.setSalary(1200000.00);
        System.out.println(friendService.updateFullObject(friends));
    }
}
