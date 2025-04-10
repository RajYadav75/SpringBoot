package in.raj.repository;

import in.raj.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFriendRepo extends JpaRepository<Friends,Integer> {
}
