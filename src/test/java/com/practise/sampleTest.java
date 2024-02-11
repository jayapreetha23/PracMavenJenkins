package com.practise;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest {
	@Test
	public void testAssert() {
		Assert.assertEquals(10, 10);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After");
	}

}
