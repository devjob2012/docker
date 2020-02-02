package co.uk.deven.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloResource {
    @GetMapping("/")
    public String greeting() {
        Optional<Integer> canBeEmpty1 = Optional.of(5);
        System.out.println(canBeEmpty1.get());

        return "greeting";
    }
}