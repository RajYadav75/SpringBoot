package in.raj.consumerComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class LoadBalancerClientClass {
    @Autowired
    private LoadBalancerClient lbClient;
    public String getBillingInfo(){
        //Get Billing Service Instance from eureka server based on LoadFactor
        ServiceInstance providerApp = lbClient.choose("ProviderApp");
        URI uri = providerApp.getUri();
        String fullUrl = uri.toString() + "/Billing-Api/billing";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(fullUrl, String.class);
        return response.getBody();
    }
}
