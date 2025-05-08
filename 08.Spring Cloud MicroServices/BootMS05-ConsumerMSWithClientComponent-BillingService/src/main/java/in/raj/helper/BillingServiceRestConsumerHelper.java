package in.raj.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BillingServiceRestConsumerHelper {
    @Autowired
    /*
    * Client Component
    * Come through AutoConfigurations
    * */
    private DiscoveryClient client;

    public String getBillingInfo(){
        //TODO:- Find and Get Service Instances of Producer By using Service ID
        List<ServiceInstance> serviceInstance = client.getInstances("PaymentService");
        //TODO:- Use first ServiceInstance from the List of instances
        ServiceInstance instance = serviceInstance.get(0);
        //TODO:- Get Producer MS URI and Make it as URL
        String url = instance.getUri() + "/Billing-Api/info";
        //TODO:- Rest Template Object
        RestTemplate restTemplate = new RestTemplate();
        //TODO:- Invoke producer MS Services method or operation by generating  HTTP call
        return restTemplate.getForObject(url, String.class);
    }

}
