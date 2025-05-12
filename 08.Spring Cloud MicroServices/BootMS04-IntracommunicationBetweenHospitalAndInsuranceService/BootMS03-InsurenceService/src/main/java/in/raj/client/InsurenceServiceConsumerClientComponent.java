package in.raj.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Component
public class InsurenceServiceConsumerClientComponent {
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getInsurenceInfo(){
        //TODO: Find and get Service Instance of Producer by using ServiceID
        List<ServiceInstance> hospitalService = discoveryClient.getInstances("HospitalService");
        //TODO: use first Instance
        ServiceInstance instance = hospitalService.get(0); //TODO manually selecting  instance
        //TODO:  get URI of  Provider MS
        URI uri = instance.getUri();
        //TODO: prepare the URL from URI pointing  b.method of the Provider MS
        String url = uri.toString() + "/Hospital-Api/hospital";
        // TODO: invoke the provider MS b.method using RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String body = response.getBody();
        return body;


    }
}
