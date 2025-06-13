//SecurityConfig.java
package in.raj.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import in.raj.service.IUserMgmtService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends  WebSecurityConfigurerAdapter {
	@Autowired
	private  IUserMgmtService userService;
	 
	
	@Override
	public  void configure(AuthenticationManagerBuilder auth) throws Exception {
	    // configure  Spring data jpa as the Authentication Info provider
		   //auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
		}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		// place  the  Authentication and Authorization logics for the request urls
		http.authorizeRequests().antMatchers("/","/user/register","/user/login").permitAll() //no  Authentication and Authorization
		.antMatchers("/bank/offers").authenticated() //only Authentication
		.antMatchers("/bank/balance").hasAnyAuthority("CUSTOMER","MANAGER")
		.antMatchers("/bank/loanApprove").hasAuthority("MANAGER")
		.anyRequest().authenticated()  //remaining 
		//.and().httpBasic()
		.and().formLogin().defaultSuccessUrl("/",true).loginPage("/user/login").loginProcessingUrl("/login").failureUrl("/user/login?error")
		//.and().rememberMe()
		  .and().logout().logoutSuccessUrl("/user/login?logout")
		.and().exceptionHandling().accessDeniedPage("/bank/denied")	// sends  request to handler method whose request path is "/denied"
		 .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);  //should be last  statement of the method chaining
		
	}

}
