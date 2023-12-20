package dev.andreina.turisteando;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cities")
public class BusinessController {
    @GetMapping
    public ResponseEntity<String> allCities() {
        return new ResponseEntity<String>("All cities", HttpStatus.OK);
    }
}
