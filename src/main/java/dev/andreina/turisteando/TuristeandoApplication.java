package dev.andreina.turisteando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TuristeandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuristeandoApplication.class, args);
		}
}
