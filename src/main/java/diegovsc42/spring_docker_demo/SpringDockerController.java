package diegovsc42.spring_docker_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringDockerController {
    @GetMapping("/hello-page")
    public String helloPage() {
        return "hello";
    }
}
