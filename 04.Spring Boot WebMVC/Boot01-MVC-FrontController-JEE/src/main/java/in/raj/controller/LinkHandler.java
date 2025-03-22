package in.raj.controller;

import in.raj.service.ILinkService;
import in.raj.service.LinkServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Set;

public class LinkHandler {
    private ILinkService service;

    public LinkHandler() {
        service = new LinkServiceImpl();
    }
    //Handler Method 1
    public String showWishMessage(HttpServletRequest req){
        //use service
        String resultMsg = service.generateWishMessage();
        req.setAttribute("wmsg",resultMsg);
        // Return Logical view name based which physical jsp file name and location will be decided
        return "wish_page";
    }

    public String showAllLanguage(HttpServletRequest req){
        Set<String> langSet = service.fetchAllLanguage();
        //keep result in request scope
        req.setAttribute("langinfo",langSet);
        //Return LVN
        return "all_lang";
    }


}
