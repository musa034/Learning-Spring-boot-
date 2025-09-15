package com.musaahotoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot3Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot3Application.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World sping boot";
    }

}
