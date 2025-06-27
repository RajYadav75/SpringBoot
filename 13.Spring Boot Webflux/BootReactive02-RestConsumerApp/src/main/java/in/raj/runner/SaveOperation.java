package in.raj.runner;

import in.raj.model.Employ;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Component
public class SaveOperation implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //create WebClient class object
        WebClient client= WebClient.create("http://localhost:4041");
        // invoke provider  service
        Mono<Employ> mono= client.
                post().
                uri("/employee/save")
                .body(Mono.just(new Employ(1100,"rajesh","sales",70000.0)),Employ.class)
                .retrieve().bodyToMono(Employ.class);

        mono.subscribe(System.out::println);
    }
}
