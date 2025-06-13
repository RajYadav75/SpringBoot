//UserOperationsController.java
package in.raj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.raj.entity.UserInfo;
import in.raj.service.IUserMgmtService;

@Controller
@RequestMapping("/user")
public class UserOperationsController {
	@Autowired
	private IUserMgmtService  userService;
	
	@GetMapping("/register")
	public   String   showUserRegistrationForm(@ModelAttribute("userInfo") UserInfo details) {
		//return LVN
		return "user_register_form";
	}
	
	@PostMapping("/register")
	public   String  registerUser(Map<String,Object> map,
			                                           @ModelAttribute("userInfo") UserInfo  details) {
		//use  the service
		String result=userService.registerUser(details);
		// keep the result in SharedMemory
		map.put("resultMsg", result);
		//return LVN
		return "user_registered_success";
	}
	
	@GetMapping("/login")
	public  String  showCustomLoginPage() {
		//return  LVN
		return  "custom_login_form";
	}
	

}
