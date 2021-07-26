package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping({"/", "/login"})
    public String login() {
        return "login";
    }

    @RequestMapping("/toMain")
    public String toMain() {
        return "main";
    }
}
