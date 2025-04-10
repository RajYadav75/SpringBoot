package in.raj.service;

import in.raj.model.Friends;
import in.raj.repository.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendServiceImpl implements IFriendService {
    @Autowired
    private IFriendRepo friendRepo;
    @Override
    public String addFriend(Friends friends) {
        Integer friendId = friendRepo.save(friends).getId();
        return "Added friend with id " + friendId;
    }
}
