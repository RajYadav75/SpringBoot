package in.raj.controller;

import in.raj.model.Friends;
import in.raj.service.IFriendService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FriendController {
    @Autowired
    private IFriendService friendService;

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("frd") Friends friends){
        return "registration-page";
    }

    @PostMapping("/register")
    public String submitRegistrationForm(@ModelAttribute("frd") Friends friends, HttpSession session){

        System.out.println("FriendController.submitRegistrationForm");
        String msg = friendService.addFriend(friends);
        session.setAttribute("resultMsg", msg);
        return "redirect:index";
    }


}
