package fuck.fuck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class FuckApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuckApplication.class, args);
    }

    @GetMapping("fuck")
    public String fuck() {
        return "fuck";
    }
}
