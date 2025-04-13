package in.raj.service;

import in.raj.model.Friends;

import java.util.List;

public interface IFriendService {
    public String addFriend(Friends friends);
    public List<Friends> showFriend();
    public String deleteFriend(int no);
    public Friends getFriendByNo(int no);
    public String updateFriend(Friends friend);

}
