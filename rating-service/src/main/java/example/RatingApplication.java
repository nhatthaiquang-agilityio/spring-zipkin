package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class RatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingApplication.class, args);
    }

    @GetMapping(value = "/available")
    public String available() {
        return "Spring Rating service";
    }
}
