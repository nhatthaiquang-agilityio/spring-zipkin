package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.context.ConfigurableApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class StudentApplication {
    private static final Logger LOG = LoggerFactory.getLogger(StudentApplication.class);

    @GetMapping(value = "/available")
    public String available() {
        return "Student service";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(StudentApplication.class, args);
        LOG.info("Connected to RabbitMQ at: {}", ctx.getEnvironment().getProperty("spring.rabbitmq.host"));
    }

}
