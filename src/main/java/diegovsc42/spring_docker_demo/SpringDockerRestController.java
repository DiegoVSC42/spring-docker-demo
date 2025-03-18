package diegovsc42.spring_docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDockerRestController {
    @GetMapping("/hello")
    public String hello() {
        return "<h1>Olá, você está acessando uma aplicação Spring através de um container Docker!<h1/>";
    }
}
