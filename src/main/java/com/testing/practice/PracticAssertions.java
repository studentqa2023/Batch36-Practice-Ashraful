package com.testing.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticAssertions {
	int a=5;
	int b=3;
	@Test(priority=0)
	public void getSum() {
		System.out.println(a+b);//8
		Assert.assertEquals(a+b, 10);
		
	}
	@Test(priority=1)
public void getMultiply() {
	System.out.println(a*b);//5
}
}
