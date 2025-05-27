package in.raj.clientcommunications;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
@Slf4j
public class BillingApiConsumingClient {
    @Autowired
    private LoadBalancerClient client;

    public  String   getBillingInfo() {
        log.info("start of  getBillingInfo() method -- start" );
        //get Provider MS instance throough LoadBalancing
        ServiceInstance SI=client.choose("ProviderMicroService");
        log.info("getting the MS instance" );
        //  get URI of  Provider MS
        URI uri=SI.getUri();
        log.info("getting the MS URI" );

        //prepare the URL from URI pointing  b.method of the Provider MS
        String url=uri.toString()+"/Billing-Api/billing";
        log.info("preparing the MS URL" );

        //  invoke the provider MS b.method using RestTemplate
        RestTemplate template=new RestTemplate();
        ResponseEntity<String> resp=template.getForEntity(url, String.class);
        log.info("Invoking the Destination MS");
        String  result=resp.getBody();
        return  result;
    }
}
