//HomeOperationsController.java
package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeOperationsController {

	@GetMapping("/")
	public  String showHomePageHelper() {
		//return LVN
		return "welcome";
	}
}
