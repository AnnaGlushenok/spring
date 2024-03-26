package mod.mod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ModApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModApplication.class, args);
    }

    @GetMapping("mod")
    public String demo() {
        return "mod";
    }
}
