/*
package in.raj.documentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
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
public class SwaggerDocumentation {
    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("in.raj.rest"))
                .paths(PathSelectors.regex("/Dost-Api"))
                .build()
                .useDefaultResponseMessages(true)
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        Contact contact= new Contact("Raj Yadav","https://github.com/RajYadav75","rajyadav@gmail.com");
        return new ApiInfo(
                "Dost Api",
                "Api for Dost Sevice Operations",
                "1.0",
                "http://www.terms.com",
                contact, "GNU-License",
                "http://rajyadav.com/gnu-license",
                Collections.emptyList()
        );
    }

}
*/
