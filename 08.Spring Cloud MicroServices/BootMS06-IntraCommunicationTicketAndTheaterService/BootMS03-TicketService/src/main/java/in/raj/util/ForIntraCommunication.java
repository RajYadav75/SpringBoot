package in.raj.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Component
public class ForIntraCommunication {
    @Autowired
    private DiscoveryClient client;

    public String ticket() {
        List<ServiceInstance> theaterServices = client.getInstances("TheaterService");
        ServiceInstance instance = theaterServices.get(0);
        URI uri = instance.getUri();
        String fullUrl = uri.toString() + "/Theater-Api/movie";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(fullUrl, String.class);
        String body = response.getBody();
        return body;
    }
}
