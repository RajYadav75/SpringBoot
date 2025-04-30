package in.raj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class WishApiConsumerRunnerTwo implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8115/BootRest15/Actor-Api/report";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println("Output from REST API: " + response.getBody());
        System.out.println("Status code value from REST API: " + response.getStatusCodeValue());
        System.out.println("Status code  from REST API: " + response.getStatusCode());
        System.out.println("-----------------------------------------------------");
        String object = restTemplate.getForObject(url, String.class);
        System.out.println("Output from REST API: " + object);
        System.exit(0);
        /*Output from REST API: {"id":1,"name":"Raj Yadav","address":"Kanapar","salary":23000.0}
        Status code value from REST API: 200
        Status code  from REST API: 200 OK
        -----------------------------------------------------
        Output from REST API: {"id":1,"name":"Raj Yadav","address":"Kanapar","salary":23000.0}
*/
    }
}
