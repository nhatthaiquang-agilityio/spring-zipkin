package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.context.ConfigurableApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class RatingApplication {
    private static final Logger LOG = LoggerFactory.getLogger(RatingApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(RatingApplication.class, args);
        LOG.info("Connected to RabbitMQ at: {}", ctx.getEnvironment().getProperty("spring.rabbitmq.host"));
    }

    @GetMapping(value = "/available")
    public String available() {
        return "Spring Rating service";
    }

    @GetMapping(value = "/error11")
    public String error11() {
        LOG.error("Error request");
        return "error 11";
    }

}
