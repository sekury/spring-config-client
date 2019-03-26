package sekury.springconfigclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sekury.springconfigclient.config.ApplicationProperties;

@RestController
@RequiredArgsConstructor
public class SimpleRestController {

    private final ApplicationProperties applicationProperties;

    @GetMapping("/message")
    public String getMessage() {
        return applicationProperties.getMessage();
    }
}
