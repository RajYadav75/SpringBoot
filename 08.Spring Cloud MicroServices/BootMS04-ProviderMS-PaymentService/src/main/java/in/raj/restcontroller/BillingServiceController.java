package in.raj.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Billing-Api")
public class BillingServiceController {
    @GetMapping("/info")
    public String getBillingInfo() {
        return "We accept card payment, UPI Payment, NetBanking Payment,COD";
    }
}
