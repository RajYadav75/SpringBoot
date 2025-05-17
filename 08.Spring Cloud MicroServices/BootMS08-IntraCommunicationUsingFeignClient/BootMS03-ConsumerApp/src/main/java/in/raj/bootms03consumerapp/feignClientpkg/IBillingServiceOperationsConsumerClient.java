package in.raj.bootms03consumerapp.feignClientpkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ProducerApp")
public interface IBillingServiceOperationsConsumerClient {
    @GetMapping("/Billing-Api/billing")
    ResponseEntity<String> getPaymentOptions();
}
