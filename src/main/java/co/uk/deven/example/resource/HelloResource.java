package co.uk.deven.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	@GetMapping("/")
	public String greeting() {
		return "greeting";
	}
}