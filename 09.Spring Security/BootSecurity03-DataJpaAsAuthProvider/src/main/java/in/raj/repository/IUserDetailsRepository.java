package in.raj.repository;

import in.raj.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface IUserDetailsRepository extends JpaRepository<UserInfo, Integer> {
    public Optional<UserInfo> findByUname(String uname);
}
