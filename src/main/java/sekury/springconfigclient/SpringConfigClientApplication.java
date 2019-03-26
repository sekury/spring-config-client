package sekury.springconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class SpringConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientApplication.class, args);
    }

}
