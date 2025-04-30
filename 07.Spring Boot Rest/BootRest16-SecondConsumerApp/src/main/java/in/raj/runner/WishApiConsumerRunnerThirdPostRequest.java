package in.raj.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WishApiConsumerRunnerThirdPostRequest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //TODO:- Create RestTemplate Class Object
        RestTemplate restTemplate = new RestTemplate();
        //TODO:- Prepare the base url
        String url = "http://localhost:8115/BootRest15/Actor-Api/register";
        //TODO:- Prepare the Json Body
        String json_Body = "{\"id\":1,\"name\":\"Raj Yadav\",\"address\":\"Kanapar\",\"salary\":50000.00}";
        //TODO:-  Prepare the header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //TODO:- Prepare the request Object
        HttpEntity<?> request = new HttpEntity<>(json_Body, headers);
        //TODO:- Invoke the Api Method
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        //TODO:- Show the Result
        System.out.println("Output from HTTP Server .... "+ response.getBody());
        System.out.println("Status code from HTTP Server .... "+ response.getStatusCode());
        System.out.println("Status code value from HTTP Server .... "+ response.getStatusCodeValue());
        System.out.println("--------------------------------------------");
        String object = restTemplate.postForObject(url, request, String.class);
        System.out.println("Output from RestTemplate .... "+ object);
        System.exit(0);

        /*Output from HTTP Server .... Actor(id=1, name=Raj Yadav, address=Kanapar, salary=50000.0)
        Status code from HTTP Server .... 201 CREATED
        Status code value from HTTP Server .... 201
                --------------------------------------------
        Output from RestTemplate .... Actor(id=1, name=Raj Yadav, address=Kanapar, salary=50000.0)
        */
    }
}
