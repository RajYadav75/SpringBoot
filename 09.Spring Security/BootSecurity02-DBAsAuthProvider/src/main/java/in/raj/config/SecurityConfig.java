package in.raj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource ds;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO:- Configure JDBC as Authentication provider
        auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("SELECT UNAME,PWD,STATUS FROM USERS WHERE UNAME=?")
                .authoritiesByUsernameQuery("SELECT UNAME,ROLE FROM USER_ROLES WHERE UNAME=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //TODO:- Place the authentication and authorization logics for the request urls
        http.authorizeRequests().antMatchers("/").permitAll() // no authentication no authorization
                .antMatchers("/offers").authenticated() //Only authentication
                .antMatchers("/balance").hasAnyAuthority("ADMIN", "MANAGER")
                .antMatchers("/loanApprove").hasAuthority("ADMIN")
                .anyRequest().authenticated() //Remaining
                //.and().httpBasic()
                .and().formLogin()
                //.and().rememberMe()
                .and().logout()
                .and().exceptionHandling().accessDeniedPage("/accessDenied") //Send Request to handler method whose request path is "/denied"
                .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);// Should be last statement of method chaining
    }
}
