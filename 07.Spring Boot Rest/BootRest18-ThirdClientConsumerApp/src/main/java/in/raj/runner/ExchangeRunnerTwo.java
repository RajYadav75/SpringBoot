package in.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeRunnerTwo implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        //Todo:- Prepare Base URL
        String url = "http://localhost:8115/BootRest17/Dost-Api/dost/{id}/{name}";

        //Todo:- Invoke the Api Service/Operation
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class, 1001, "Raj Ankita");
        //Todo:- Show the results
        System.out.println("----------------------------------------------");
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());

    }
}
