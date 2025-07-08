package in.raj.repo;

import in.raj.entity.Friends;
import org.springframework.data.repository.CrudRepository;

public interface IFriendRepo extends CrudRepository<Friends,Integer> {
}
