package in.raj.service;

import in.raj.entity.Friends;
import org.springframework.data.domain.Page;

public interface IFriendService {
    public Page<Friends> showFriendsDataByPageNumber(int pageNo, int pageSize, boolean ascOrder, String props);
}
