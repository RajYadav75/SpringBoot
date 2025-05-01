package in.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeRunnerThree implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        // Todo:- Prepare the base url
        String url ="http://localhost:8115/BootRest17/Dost-Api/register";
        // Todo:- Prepare the json body
        String json_body = "{\"id\":1001,\"name\":\"Raj Yadav\",\"girlFriendName\":\"Ankita Tiwari\",\"pocketMoney\":2000.00}";
        // Todo:- Prepare Request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // Todo:- Prepare HttpEntity Object having headers body
        HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);
        // Todo:- Invoke the Api Services
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        // Todo:- show the results
        System.out.println("output is ::"+response.getBody());
        System.out.println("stsatuc code::"+response.getStatusCode());
        System.exit(0);
    }
}
