package in.raj.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Component
public class Consumer {
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getMsgInfo(){
        List<ServiceInstance> wishMsgProviderApp = discoveryClient.getInstances("WishMsgProviderApp");
        ServiceInstance instance = wishMsgProviderApp.get(0);
        URI uri = instance.getUri();
        String fullUrl = uri.toString() + "/Massage-Api/wish";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(fullUrl, String.class);
        return response.getBody();
    }
}
