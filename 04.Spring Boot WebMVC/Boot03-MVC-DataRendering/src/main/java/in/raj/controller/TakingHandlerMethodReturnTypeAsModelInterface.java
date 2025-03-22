package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class TakingHandlerMethodReturnTypeAsModelInterface {
    @RequestMapping("/process") // here the Logical View Name is request path(process.jsp)
    public Model process(){
        Model model = new BindingAwareModelMap(); //Manually create shared memory
        //add model attribute to shared memory
        model.addAttribute("name","Raj Yadav");
        model.addAttribute("gfName","Ankita");
        model.addAttribute("sysDate", LocalDateTime.now());

        return model;


    }

}
