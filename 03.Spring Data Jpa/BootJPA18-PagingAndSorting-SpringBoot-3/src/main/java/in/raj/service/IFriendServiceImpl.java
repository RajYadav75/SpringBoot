package in.raj.service;

import in.raj.entity.Friends;
import in.raj.repo.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class IFriendServiceImpl implements IFriendService {
    @Autowired
    private IFriendRepo friendRepo;

    @Override
    public void showFriendPageByPage(int page) {
        // get total record count
        long count = friendRepo.count();
        // get page count
        long pageCount = count/page;
        pageCount=(count%page==0)?pageCount:++pageCount;
        for( int i=0; i<pageCount; i++ ){
            // prepare the Pageable object
            Pageable pageable = PageRequest.of(i,page);
            Page<Friends> freindPage = friendRepo.findAll(pageable);
            freindPage.forEach(System.out::println);
            System.out.println("---------------"+(freindPage.getNumber()+1)+"/"+freindPage.getTotalPages()+"---------------------------");
        }
    }
}
