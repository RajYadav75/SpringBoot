package in.raj.controller;

import in.raj.model.Friends;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FriendController {

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("frd") Friends friends){
        return "registration-page";
    }


}
