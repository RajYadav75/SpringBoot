package in.raj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Theater-Api")
public class TheaterRestController {
    @GetMapping("/movie")
    public String movieGenre() {
        return "John Wick AKA Baba Yaga";
    }
}
