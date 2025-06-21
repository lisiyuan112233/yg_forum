package com.sia.userservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {
    @GetMapping
    public String login(){
        return "login";
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
        System.out.println(new BCryptPasswordEncoder().matches("123456","$2a$10$/oDI6yl6ogtJCwF1CL3VhuXYubryfl8zwK43edSzWvRqpGxyTVKba"));
    }
}
