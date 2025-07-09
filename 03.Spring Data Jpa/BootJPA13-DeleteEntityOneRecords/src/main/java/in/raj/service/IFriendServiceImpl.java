package in.raj.service;

import in.raj.entity.Friends;
import in.raj.repo.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IFriendServiceImpl implements IFriendService {
    @Autowired
    private IFriendRepo friendRepo;
    @Override
    public String deleteFriend(Friends friends) {
        Optional<Friends> friendRepoById = friendRepo.findById(friends.getId());
        if (friendRepoById.isEmpty()) {
            return friends.getId()+" friend Not Exist";
        }else{
            friendRepo.delete(friendRepoById.get());
            return friends.getId()+" friend Deleted";
        }
    }
}
