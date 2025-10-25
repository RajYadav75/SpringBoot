package in.raj.runner;


import in.raj.document.Employ;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


@Component("emp")
public class EmpRunner implements CommandLineRunner {
    @Autowired
    private IEmployService employService;

    @Override
    public void run(String... args) throws Exception {
        try {
            /*Properties properties = new Properties();
            properties.put("Voter Id", "78952AV487");
            properties.put("Aadhar Card", 289625413685L);
            properties.put("E-Sharm Card", "78952AV487");
            Employ employ = new Employ(1001,"Raj Yadav","Kanapar",18000.00,
                    new String[]{"red","black","darkgray"},
                    List.of("Deepak","Ambrikesh","Yash"),
                    Set.of(8115605500L,8127635244L,9956960142L),
                    properties,
                    Map.of(8115,"Raj Jeevan Anand LIC",6388,"Ankita Jeevan Umang"));
            System.out.println("================================================================");
            System.out.println(employService.registerEmploy(employ));
            System.out.println("----------------------------------------------------------------");*/
            employService.getAllEmployees().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
