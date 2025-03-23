package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class PassingArrayAndCollections {
    @GetMapping("/arraysCollection")
    public String process(Map<String, Object> map) {
        map.put("favColor",new String[]{"red","green","blue"});
        map.put("nickNames", List.of("Ankita","Raj","BabaYaga"));
        map.put("phoneNo", Set.of(8115605569L,6388141558L));
        map.put("idDetails",Map.of("adharNo",78454684,"panNo",88779955));
        return "jstlCore";
//        return "arraysCollection";
    }
}
