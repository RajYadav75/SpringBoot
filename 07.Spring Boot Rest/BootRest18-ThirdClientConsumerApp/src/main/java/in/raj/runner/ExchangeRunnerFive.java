package in.raj.runner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.raj.model.Dost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ExchangeRunnerFive implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        // TODO:- Prepare the base url
        String url = "http://localhost:8115/BootRest17/Dost-Api/reportAll";
        // TODO:- Invoke The Api Service/Operation
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        // TODO:- Show the result
        System.out.println("Output from Server .... "+response.getBody());
        System.out.println("Output from Server .... "+response.getStatusCode());
        System.out.println("Output from Server .... "+response.getStatusCodeValue());
        System.out.println("-------------------------------------------------");
        // TODO:-Convert List/Array of Json Docs to List<Dost> object
        ObjectMapper mapper = new ObjectMapper();
        List<Dost> dosts = mapper.readValue(response.getBody(), new TypeReference<List<Dost>>() {});
        dosts.forEach(System.out::println);
        System.exit(0);

    }
}
