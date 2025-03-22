package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class TakingModelAndViewLegacyStyleAsReturnTypeOfHandlerMethod {
    @RequestMapping("/modelandview")
    public ModelAndView process(){
        // Create SharedMemory
        ModelAndView mav = new ModelAndView();
        // Add Model Attribute to SharedMemory
        mav.addObject("name","Raj");
        mav.addObject("gf","Ankita");
        mav.addObject("ldt", LocalDateTime.now());
        // place LVN to MAV object
        mav.setViewName("modelandView");
        return mav;
    }
}
