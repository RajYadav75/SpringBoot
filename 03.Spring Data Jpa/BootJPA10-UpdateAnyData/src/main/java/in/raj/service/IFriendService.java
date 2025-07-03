package in.raj.service;

import in.raj.entity.Friends;

public interface IFriendService {
    public String saveFriends(Iterable<Friends> friends);

    public String updateFriendsById(Integer id, String name);
}
