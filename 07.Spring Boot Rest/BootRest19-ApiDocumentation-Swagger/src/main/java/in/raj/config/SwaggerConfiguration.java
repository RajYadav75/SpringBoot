package in.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
//(or) @EnableSwagger2WebMvc

public class SwaggerConfiguration {
    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2) //TODO:- UI Screen Type
                .select() //TODO:- to specify RestControllers
                .apis(RequestHandlerSelectors.basePackage("in.raj.rest")) //TODO:- Base package for Rest Controllers
                .paths(PathSelectors.regex("/Student-Api.*")) //TODO:- To Specify request paths
                .build() //TODO:- Build the Docket Object
                .useDefaultResponseMessages(true)
                .apiInfo(getApiInfo());
    }
    private ApiInfo getApiInfo() {
        Contact contact = new Contact("Raj","http://www.license.com","rajyadav@gmail.com");
        return new ApiInfo(
                "StudentAPI",
                "Api For Student Operation",
                "1.0",
                "http://www.terms.com",
                contact, "GNU-License",
                "http://rajyadav.com/gnu-license",
                Collections.emptyList()
        );
    }
}
