package com.scalefocus.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloWorld {

    @Override
    public String sayHello() {
        return "Hello, Spring!\n";
    }
}
