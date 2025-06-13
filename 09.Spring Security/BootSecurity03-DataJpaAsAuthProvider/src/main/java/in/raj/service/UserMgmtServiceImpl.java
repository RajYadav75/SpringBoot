package in.raj.service;

import in.raj.entity.UserInfo;
import in.raj.repository.IUserDetailsRepository;
import java.util.Optional;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserMgmtServiceImpl implements IUserMgmtService{
    @Autowired
    private IUserDetailsRepository userRepo;
    @Override
    public String registerUser(UserInfo details) {
        // Encrypt the password
        BCryptPasswordEncoder encoder=new  BCryptPasswordEncoder();
        //encode the password
        details.setPwd(encoder.encode(details.getPwd()));
        //use repo
        int idVal = userRepo.save(details).getUnid();
        return "User is registered with the Id Value"+idVal;
    }


    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        //use Repo
        Optional<UserInfo> opt=userRepo.findByUname(username);
        if(opt.isEmpty()) {
            throw new IllegalArgumentException("user not found");
        }
        else {
            //convert Set<String> roles to Set<SGA> roles
            UserInfo  details=opt.get();
		/*	 Set<GrantedAuthority>  GARoles=new HashSet();
			 for(String role:details.getRoles()) {
				 SimpleGrantedAuthority  sga=new SimpleGrantedAuthority(role);
				 GARoles.add(sga);
			 }
			//Convert  UserDetails obj (Entity object) to User object
			 User user=new User(details.getUname(),details.getPwd(),GARoles); */
            User user=new User(details.getUname(),details.getPwd(),
                    details.getRoles().stream().map(role->new SimpleGrantedAuthority(role)).collect(Collectors.toSet()));
            return user;
        }

    }
}
