package com.scalefocus.helloworld.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    private String greetings = "";

    @Test
    void sayHello() {
        this.greetings = this.helloService.sayHello();

        Assertions.assertEquals("Hello, Plovdiv!\n", this.greetings);
    }
}