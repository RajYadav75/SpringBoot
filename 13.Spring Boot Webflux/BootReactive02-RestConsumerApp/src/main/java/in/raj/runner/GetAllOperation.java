package in.raj.runner;

import in.raj.model.Employ;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
@Component
public class GetAllOperation implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // create webClient object
        WebClient webClient = WebClient.create("http://localhost:4041");
        //invoke provider service
        Flux<Employ> employFlux = webClient.get()
                .uri("/employee")
                .retrieve()
                .bodyToFlux(Employ.class);

        employFlux.doOnNext(System.out::println).blockLast();
    }
}
