package diegovsc42.spring_docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDockerController {
    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World<h1/>";
    }
}
