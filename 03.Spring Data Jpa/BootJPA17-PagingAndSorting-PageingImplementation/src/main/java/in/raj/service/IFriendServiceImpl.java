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
    public Page<Friends> showFriendsDataByPageNumber(int pageNo, int pageSize, boolean ascOrder, String props) {
        //TODO: Prepare the sort object
        Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
        // TODO: Prepare the Page Object
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        //TODO : Use repo
        Page<Friends> page = friendRepo.findAll(pageable);
        return page;
    }
}
