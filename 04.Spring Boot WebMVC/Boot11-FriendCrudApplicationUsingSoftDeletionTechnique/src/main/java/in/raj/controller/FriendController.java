package in.raj.controller;

import in.raj.model.Friends;
import in.raj.service.IFriendService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

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
        return "redirect:friend-list";
    }

    @GetMapping("/friend-list")
    public String showFriendList(Map<String,Object>map){
        List<Friends> friendsList = friendService.showFriend();
        map.put("frdList", friendsList);
        return "friendList-page";
    }

    @GetMapping("/delete-friend")
    public String deleteFriend(@RequestParam("id") int id, RedirectAttributes attr){
        String deleteFriend = friendService.deleteFriend(id);
        attr.addFlashAttribute("deleteFriend", deleteFriend);
        return "redirect:friend-list";

    }

    @GetMapping("/edit")
    public String showEditFriendForm(@RequestParam("id") int id, @ModelAttribute("frd") Friends friends){
        Friends friendByNo = friendService.getFriendByNo(id);
        BeanUtils.copyProperties(friendByNo, friends);
        return "edit-page";
    }

    @PostMapping("/edit")
    public String submitEditFriendForm(@ModelAttribute("frd") Friends friends, HttpSession session){
        String msg = friendService.updateFriend(friends);
        session.setAttribute("resultMsg", msg);
        return "redirect:friend-list";
    }



}
