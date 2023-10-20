package com.example.mob_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class TestController {

    @GetMapping
public String hi() {
    return "Hi";
}

}
