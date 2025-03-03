package com.example.SpringBoot3;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}

class User {
    private String firstName;
    private String lastName;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}

