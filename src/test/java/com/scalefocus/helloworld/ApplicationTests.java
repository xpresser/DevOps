package com.scalefocus.helloworld;

import com.scalefocus.helloworld.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private HelloController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(this.controller);
	}

}
