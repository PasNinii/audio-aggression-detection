package com.back.back;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackApplicationTests {

	@Test
	void contextLoads() {
		Integer number = 1;
		assertEquals(1, number);
	}

}
