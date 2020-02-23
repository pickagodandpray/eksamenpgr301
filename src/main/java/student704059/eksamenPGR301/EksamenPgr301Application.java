package student704059.eksamenPGR301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class EksamenPgr301Application {

	@GetMapping("/message")
	public String getMessage(){
		return "Hello World";
	}

	public static void main(String[] args) {

		SpringApplication.run(EksamenPgr301Application.class, args);
	}

}
