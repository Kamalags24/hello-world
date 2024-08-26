package bj.highfiveuniversity.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping
	public String getMethodName(@RequestParam String param) {
		return new String();
	}

	public String hello(String name) {
		return String.format("Hello %s !", name);
	}

}
