package com.scalefocus.helloworld.controller;

import com.scalefocus.helloworld.service.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloWorld helloWorld;

    @Autowired
    public HelloController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @GetMapping
    public String greet() {
        return this.helloWorld.sayHello();
    }
}
