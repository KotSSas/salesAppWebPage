package com.example.salesappdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/home")
    public String index() {
        return "index";
    }
    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
}
