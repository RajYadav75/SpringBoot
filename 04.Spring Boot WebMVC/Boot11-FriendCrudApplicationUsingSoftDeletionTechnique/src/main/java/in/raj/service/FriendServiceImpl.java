package in.raj.service;

import in.raj.model.Friends;
import in.raj.repository.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendServiceImpl implements IFriendService {
    @Autowired
    private IFriendRepo friendRepo;
    @Override
    public String addFriend(Friends friends) {
        Integer friendId = friendRepo.save(friends).getId();
        return "Added friend with id " + friendId;
    }

    @Override
    public List<Friends> showFriend() {
        return friendRepo.findAll();
    }

    @Override
    public String deleteFriend(int no) {
        friendRepo.deleteById(no);
        return "Deleted friend with id " + no;
    }

    @Override
    public Friends getFriendByNo(int no) {
        Friends frd = friendRepo.getReferenceById(no);
        return frd;
    }

    @Override
    public String updateFriend(Friends friend) {
        Optional<Friends> friends = friendRepo.findById(friend.getId());
        if (friends.isPresent()) {
            friendRepo.save(friend);
            return "Updated friend with id " + friend.getId();
        }
        return "No such friend"+friend.getId();
    }
}
