package in.raj.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity  // Make the Normal @Configuration class Spring Security configuration class
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // InMemory DB  as the Authentication Info provider
        auth.inMemoryAuthentication().withUser("Raj").password("{noop}yadav").roles("MANAGER");
        auth.inMemoryAuthentication().withUser("Deepak").password("{noop}kumar").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/offers").authenticated()
                .antMatchers("/balance").hasAnyRole("ADMIN", "MANAGER")
                .antMatchers("/loanApproval").hasRole("MANAGER")
                .anyRequest().authenticated() // remaining
                .and().httpBasic()
                .and().formLogin()
                .and().rememberMe()
                .and().logout()
                .and().exceptionHandling().accessDeniedPage("/access-denied") // send request to handler method whose request path is /denied
                .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
    }
}
