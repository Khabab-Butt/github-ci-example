package com.example.CIExample1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest2 {
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hallo", app.sayHello());
	}
}
