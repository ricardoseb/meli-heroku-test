package cl.riqui.meliherokutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@Controller
@SpringBootApplication
public class MeliHerokuTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeliHerokuTestApplication.class, args);
    }

    @GetMapping
    Mono<Rendering> home() {
        return
        Mono.just(Rendering.view("index.html")
                .modelAttribute("pageTitle", "HOLA")
                .build());
    }
}
