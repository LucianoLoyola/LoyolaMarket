package com.loyolaluciano.loyolamarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wave")
public class HelloWorldController {
    @GetMapping("/hello")
    public String saludar(){
        return("Never stop learning");
    }
}
