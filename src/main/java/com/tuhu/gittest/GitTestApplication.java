package com.tuhu.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class GitTestApplication {

    @GetMapping("/world")
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

}
