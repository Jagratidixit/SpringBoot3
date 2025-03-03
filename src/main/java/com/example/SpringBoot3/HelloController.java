package com.example.SpringBoot3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/welcome")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
