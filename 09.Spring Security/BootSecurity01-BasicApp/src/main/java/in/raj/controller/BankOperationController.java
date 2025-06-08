package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/Loan-Api")
public class BankOperationController {

    @GetMapping("/")
    public String showHomePage() {
        return "welcome";
    }

    @GetMapping("/offers")
    public String showOffersPage() {
        return "show_offers";
    }

    @GetMapping("/balance")
    public String showBalancePage(Map<String, Object> map) {
        // make the balance as the model attribute value
        map.put("balance", new Random().nextDouble(100000.00));
        // Return LVN
        return "show_balance";
    }

    @GetMapping("/loanApprove")
    public String performLoanApproval(Map<String, Object> map) {
        map.put("approval", new Random().nextInt(50233320));
        return "loan";
    }

    @GetMapping("/denied")
    public  String   showAccessDeniedPage() {
        //return  LVN
        return "access_denied";
    }
}
