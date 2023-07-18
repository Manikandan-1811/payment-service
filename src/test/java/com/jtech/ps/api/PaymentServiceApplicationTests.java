package com.jtech.ps.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PaymentServiceApplicationTests {
	@Autowired
	private PaymentServiceApplication serviceApplication;
	@Test
	void contextLoads() {
		assertThat(serviceApplication).isNotNull();
	}

}
