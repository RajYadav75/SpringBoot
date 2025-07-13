package in.raj.runner;

import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PagingRunner implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        friendService.showFriendPageByPage(3);
    }
}
