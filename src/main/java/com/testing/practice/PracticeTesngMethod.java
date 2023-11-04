package com.testing.practice;

import org.testng.annotations.Test;

public class PracticeTesngMethod {
	@Test(priority =0 ,groups= {"Smoke"})
public void login() {
	System.out.println("This is login method");
}
@Test(priority = 1,groups= {"Regression"})
public void dress() {
	System.out.println("This is dress method");
	
}
@Test(priority = 2,groups= {"Smoke"})
public void cart() {
	System.out.println("This is cart method");
}
@Test(priority = 3)
public void payment() {
	System.out.println("This is payment method");
	
}
@Test(priority = 4)
public void placeOrder() {
	System.out.println("This is place order method");
}

}


