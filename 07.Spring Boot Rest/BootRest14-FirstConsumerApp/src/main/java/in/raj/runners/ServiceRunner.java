package in.raj.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Todo: Create RestTemplate Class Object
        RestTemplate restTemplate = new RestTemplate();
        // Todo: Define Service Url
        String url = "http://localhost:8080/BootRest13/Wish-Api/greet";
        //Todo: Generate HttpRequest with Get mode to consume the web service(Api)
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        //Todo: Display the received details from the response
        System.out.println("Response body (Output) : "+response.getBody());
        System.out.println("Response status code value : "+response.getStatusCodeValue());
//        System.out.println("Response Status code : "+response.getStatusCode().name());
        System.exit(0);
    }
}
