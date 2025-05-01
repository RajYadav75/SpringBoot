package in.raj.runner;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.raj.model.Dost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ExchangeRunnerFour implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        //TODO-: Prepare the base url
        String url = "http://localhost:8115/BootRest17/Dost-Api/report";
        //TODO-: Invoke The Api Service
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        //TODO-:Show the Result
        System.out.println("-------------------------------------");
        System.out.println("Output is : " + response.getBody());
        System.out.println("Status code  is : " + response.getStatusCode());
        System.out.println("Status code value is : " + response.getStatusCodeValue());
        System.out.println("-----------------------------------");
        // TODO:- Convert Json Text to Model Class Object using Jackson Api
        ObjectMapper mapper = new ObjectMapper();
        Dost dost = mapper.readValue(response.getBody(), Dost.class);
        System.out.println("Dost Object data is : " + dost);
        System.exit(0);
        System.out.println("__________________________________________");
    }
}
