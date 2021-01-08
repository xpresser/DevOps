package com.scalefocus.helloworld.service;

import com.scalefocus.helloworld.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    private HelloController helloController;

    @Autowired
    private HelloService helloService;

    private String actualResult = "";

    @Test
    void sayHello() {
        this.actualResult = helloService.sayHello();

        String expectedResult = helloController.greet();

        Assertions.assertEquals(expectedResult, actualResult);
    }
}