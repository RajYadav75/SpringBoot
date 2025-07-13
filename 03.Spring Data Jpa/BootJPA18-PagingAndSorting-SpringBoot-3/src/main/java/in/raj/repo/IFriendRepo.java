package in.raj.repo;

import in.raj.entity.Friends;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFriendRepo extends PagingAndSortingRepository<Friends, Integer>, CrudRepository<Friends, Integer> {
}
