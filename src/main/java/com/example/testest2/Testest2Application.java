package com.example.testest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Testest2Application {

    @GetMapping("/welcomemessage")
    String wlcmes(){
        return "velkommen til mit springprojekt";
    }

    

    public static void main(String[] args) {
        SpringApplication.run(Testest2Application.class, args);
    }

}
