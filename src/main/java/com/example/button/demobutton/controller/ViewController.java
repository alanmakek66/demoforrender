package com.example.button.demobutton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
@Controller
public class ViewController {


    @GetMapping("/index")
    public String index() {
        
        return "index"; // 返回 login.html
    }
    
    @GetMapping("/index2")
    public String index2() {
        
        return "index2"; 
    }

    
    
}