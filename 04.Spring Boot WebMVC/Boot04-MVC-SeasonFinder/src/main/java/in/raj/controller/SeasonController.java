package in.raj.controller;

import in.raj.service.ISeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SeasonController {
    @Autowired
    private ISeasonService seasonService;


    @RequestMapping("/")
    public String showHome(){
        return "SeasonTemplate";
    }

    @RequestMapping("/season")
    public String showSeason(Map<String, Object> map){
        String season = seasonService.getSeason();
        map.put("resultMsg", season);
        return "season";
    }
}
