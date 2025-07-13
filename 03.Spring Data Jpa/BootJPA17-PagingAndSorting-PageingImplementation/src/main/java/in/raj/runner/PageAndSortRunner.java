package in.raj.runner;

import in.raj.entity.Friends;
import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PageAndSortRunner implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        try{
            Page<Friends> friendsPage = friendService.showFriendsDataByPageNumber(2, 3, false, "name");
            System.out.println("page number :: "+friendsPage.getNumber());
            System.out.println("page size :: "+friendsPage.getSize());
            System.out.println("Page count :: "+friendsPage.getTotalPages());
            System.out.println("is it first page ::"+friendsPage.isFirst());
            System.out.println("is it last page ::"+friendsPage.isLast());
            System.out.println("Page Element count :: "+friendsPage.getNumberOfElements());
            if (!friendsPage.isEmpty()){
                List<Friends> content = friendsPage.getContent();
                content.forEach(System.out::println);
            }else{
                System.out.println("No page found");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
