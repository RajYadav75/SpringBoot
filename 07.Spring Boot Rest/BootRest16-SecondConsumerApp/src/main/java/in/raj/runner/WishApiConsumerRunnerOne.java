package in.raj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class WishApiConsumerRunnerOne implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8115/BootRest15/Actor-Api//wish1/{id}/{name}";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, 1, "Raj Yadav");
        System.out.println("Output is :: " + response.getBody());
        System.out.println("Status code value is :: " + response.getStatusCodeValue());
        System.out.println("Status code  is :: " + response.getStatusCode());

        System.out.println("---------------------------------------------------------");
        String object = restTemplate.getForObject(url, String.class, 1, "Ankita Yadav");
        System.out.println("Output is :: " + object);

        /*
         Output is :: Namaste Sir,Madam 1 Raj Yadav
        Status code value is :: 200
        Status code  is :: 200 OK
        ---------------------------------------------------------
        Output is :: Namaste Sir,Madam 1 Ankita Yadav
         */
    }
}
