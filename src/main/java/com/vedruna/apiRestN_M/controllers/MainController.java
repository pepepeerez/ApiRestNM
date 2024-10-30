package com.vedruna.apiRestN_M.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MainController {
    @GetMapping("/")
    public String test() {
        return "Hello World";
    }
    
}
