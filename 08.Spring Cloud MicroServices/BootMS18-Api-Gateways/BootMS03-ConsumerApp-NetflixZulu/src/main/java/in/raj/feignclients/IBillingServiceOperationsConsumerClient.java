package in.raj.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BillingService")
public interface IBillingServiceOperationsConsumerClient {

    @GetMapping("/Billing-Api/billing")
    public ResponseEntity<String> getPaymentInfo();
}
