package in.raj.providerconfiguration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface IBillingSeriviceOperationsConsumerClient {

    @GetMapping("/Billing-Api/billing")
    public ResponseEntity<String> billing();
}
