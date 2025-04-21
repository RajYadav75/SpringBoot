package in.raj.rest;

import in.raj.model.Friends;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Friend-Api")
public class FriendRestController {
    @PostMapping("/register")
    public ResponseEntity<Friends> registerFriend(@RequestBody Friends friends) {
        System.out.println(friends);

        return new ResponseEntity<>(friends, HttpStatus.OK);

    }
}
