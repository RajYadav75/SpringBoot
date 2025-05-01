package in.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeRunnerFour implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        //TODO-: Prepare the base url
        String url = "http://localhost:8115/BootRest17/Dost-Api/report";
        //TODO-:
        //TODO-:
        //TODO-:
        //TODO-:
        //TODO-:
    }
}
