package in.raj.service;

import in.raj.entity.Friends;
import in.raj.repo.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IFriendServiceImpl implements IFriendService {
    @Autowired
    private IFriendRepo friendRepo;
    @Override
    public String updateFriendsById(Integer id, String name) {
        Optional<Friends> byId = friendRepo.findById(id);
        if(byId.isPresent()) {
            Friends friends = byId.get();
            String newName = "Raj Yadav";
            friends.setName(newName);
            return  friendRepo.save(friends).getId()+"is updated with new Name "+newName;
        }else {
            return id + "Friends not found";
        }
    }


    @Override
    public String saveFriends(Iterable<Friends> friends) {
        if (friends != null){
            Iterable saveFriends = friendRepo.saveAll(friends);
            int size = ((Collection<?>) saveFriends).size();
            List<Integer> ids=(List<Integer>)((Collection)saveFriends).stream()
                    .map(friend->((Friends)friend).getId())
                    .collect(Collectors.toList());
            return size + "no. of Student are saved with id values :: "+ids.toString();
        }
        else {
            throw new IllegalArgumentException("Invalid Student info");
        }
    }
}
