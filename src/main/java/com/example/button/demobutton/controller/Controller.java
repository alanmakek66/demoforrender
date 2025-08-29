package com.example.button.demobutton.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.OutputStream;
import java.net.Socket;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String home() {
        return "Hello from Spring Boot on Render!";
    }
    
}