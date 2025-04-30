package in.raj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeRunnerOne implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // Todo:- Create Rest Template class Object
        RestTemplate restTemplate = new RestTemplate();
        // Todo:- Define Service Url
        String url = "http://localhost:8115/BootRest17/Dost-Api/wish";
        // Todo:- Invoke Service Method/operation using exchange(-,-,-)method
        ResponseEntity<String> exchangeResponse = restTemplate.exchange(
                                                                url,
                                                                HttpMethod.GET,
                                                                null,// Todo: No Body For Get Mode Request we don't want to pass any header value and Body
                                                                String.class
        );
        // Todo:- Display the details
        System.out.println("Output is :: "+exchangeResponse.getBody());
        System.out.println("Status code  is :: "+exchangeResponse.getStatusCode());
        System.out.println("Status code and its value is :: "+exchangeResponse.getStatusCodeValue());

    }
}
