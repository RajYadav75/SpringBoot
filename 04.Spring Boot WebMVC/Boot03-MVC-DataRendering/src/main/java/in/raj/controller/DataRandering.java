package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class DataRandering {
    /*@RequestMapping("/")
    public String process(Map<String,Object> map){
        map.put("value1","Raj");
        map.put("value2","Ankita");
        return "DataRenderingPage";
    }*/

//TODO:- (Best practice) Best of way representing sharedmemory because it makes the code non-invasive
    /*@RequestMapping("/bestPractice")
    public String bestPractice(Map<String, Object> map){
        System.out.println("DataRandering.bestPractice :: SharedMemory Object class name"+map.getClass());
        map.put("name","Raj Yadav");
        map.put("sysDt", LocalDateTime.now());
        return "bestPracticePage";
    }*/

//TODO:- (Bad practice) This is bad practice to because Model(I) is Spring API specific interface it makes the code as non-invasive
    /*@RequestMapping("/badPractice")
    public String badPractice(Model model){
        System.out.println("DataRandering.badPractice :: SharedMemory Object class name"+model.getClass());
        model.addAttribute("name","Raj Yadav");
        model.addAttribute("sysDt", LocalDateTime.now());
        return "badPracticePage";
    }*/
//TODO:- (Bad practice) Not Good Practice because ModelMap is spring Api class i.e code beacome invasive

    /*@RequestMapping("/alsoBadPractice")
    public String badPractice(ModelMap model){
        System.out.println("DataRandering.badPractice :: SharedMemory Object class name"+model.getClass());
        model.addAttribute("name","Raj Yadav");
        model.addAttribute("sysDt", LocalDateTime.now());
        return "badPracticePage";
    }*/


}
