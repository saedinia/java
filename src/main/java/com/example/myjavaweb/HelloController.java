package com.example.myjavaweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/home")
    public String home() {
        return "Hello from Java Web (Spring Boot)!";
    }
}
