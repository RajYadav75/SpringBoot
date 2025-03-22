package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TakingMapStringObjectAsReturnTypeOfHandlerMethod {
    @RequestMapping("/mapStringObject") // Logical View Name is (mapStringObject)
    public Map<String,Object> process(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","Raj Yadav");
        map.put("gfName","Ankita Tiwari");
        map.put("sysTime", LocalDateTime.now());
        return map;
    }

}
