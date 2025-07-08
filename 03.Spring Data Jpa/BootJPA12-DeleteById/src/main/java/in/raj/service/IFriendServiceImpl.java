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
    public String deleteFriendById(Integer id) {
        Optional<Friends> friendRepoById = friendRepo.findById(id);
        if (friendRepoById.isPresent()) {
            friendRepo.deleteById(id);
            return "Friend with id " + id +" has been deleted";
        }
        else {
            return "Friend with id " + id + " not found";
        }
    }
}
