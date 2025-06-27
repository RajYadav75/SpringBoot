package in.raj.runner;

import in.raj.model.Employ;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Component
public class GetRecordById implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //create WebClient class object
        WebClient client= WebClient.create("http://localhost:4041");
        // invoke provider  service
        Mono<Employ> mono=client.
                get().
                uri("/employee/one/1100")
                .retrieve().bodyToMono(Employ.class);

        mono.subscribe(System.out::println);
    }
}
