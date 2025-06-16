package in.raj.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class GmailOAuthController {
    @GetMapping("/home")
    public String showHome() {
        return "<h1> Welcome to  RedBus.com </h1>";
    }
    @GetMapping("/after")
    public   String  aferLogin() {
        return "<h1> After successfully Loging  RedBus using third party App </h1>";
    }
    @GetMapping("/user")
    public Authentication showUserDetails(Principal principal) {
        System.out.println("Currently logged in user: " + principal.getName());
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }
}
