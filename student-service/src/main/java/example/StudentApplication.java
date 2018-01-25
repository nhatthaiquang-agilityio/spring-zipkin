package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class StudentApplication {

    @GetMapping(value = "/available")
    public String available() {
        return "Student service";
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

}
