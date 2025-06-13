package in.raj.controller;

import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class BankOperationsController {
	
	
/*	@GetMapping("/")
	public  String  showHome(HttpSession ses) {
		 //specify  max idle time period
		//ses.setMaxInactiveInterval(120);  //120 secs=2 mins
		//return LVN
		return "welcome";
	} */
	
	
	@GetMapping("/offers")
	public  String  showOffers() {
		//return LVN
		
		return  "show_offers";
		
	}
	
	@GetMapping("/balance")
	public String  showBalance(Map<String,Object> map) {
	     // make the balance as the model attribute value
		  map.put("balance", new Random().nextInt(200000));
		  //return LVN
		  return  "show_balance";
	}
	
	@GetMapping("/loanApprove")
	public   String  performLoanApprove(Map<String,Object> map) {
		// keep  the  approved  loan  amount  as the model attribute
		 map.put("amount",new Random().nextInt(2000000));
		 //return LVN
		 return  "loan";
	}
	
	
	@GetMapping("/denied")
	public  String   showAccessDeniedPage() {
		//return  LVN
		return "access_denied";
		}
	

}
