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
    public String updateFullObject(Friends friends) {
        // Load Doctor Object
        Optional<Friends> findBYId = friendRepo.findById(friends.getId());
        if (findBYId.isPresent()) {
            friendRepo.save(friends);  // TODO:- For Update Object operation
            return friends.getName()+" Friends details are found and updated successfully";
        }else  {
            return friends.getName()+" Friends details are not found";
        }
    }
}
