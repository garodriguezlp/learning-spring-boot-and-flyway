package com.example.demo.controller;

import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        if (name == null || name.isBlank()) {
            name = "world";
        }
        helloService.save(name);
        return format("Hello %s", name);
    }
}
