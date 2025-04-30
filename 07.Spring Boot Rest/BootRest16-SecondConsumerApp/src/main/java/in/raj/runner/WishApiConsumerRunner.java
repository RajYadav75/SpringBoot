package in.raj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class WishApiConsumerRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Create Rest Template class Object
        RestTemplate restTemplate = new RestTemplate();
        //prepare Base URL
        String baseUrl = "http://localhost:8115/BootRest15/Actor-Api/wish";
        //Invoke the Api Services/Operation
        ResponseEntity<String> response = restTemplate.getForEntity(baseUrl, String.class);
        //Show The Result
        System.out.println("Output is :: "+response.getBody());
        System.out.println("Status code value  is :: "+response.getStatusCodeValue());
        System.out.println("Status code  is :: "+response.getStatusCode());
        System.out.println("--------------------------------------");
        String object = restTemplate.getForObject(baseUrl, String.class);
        System.out.println("Output is :: "+object);
        System.exit(0);
    }
}
