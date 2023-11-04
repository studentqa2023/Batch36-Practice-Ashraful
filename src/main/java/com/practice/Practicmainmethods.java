package com.practice;

public class Practicmainmethods {
public void getvoidMethod() {
	System.out.println("there is a non void method");
	
}
// static void method(not returning method)

public static void getStaticVoid() {
	System.out.println("THERE is static void method");
	
}

public  String getReturnMethod() {
	System.out.println("there is non statict return method");
	
	return "smarttech";
	}
	

	
	// static return method.
	public static int getStaticRetrunmethod() {
		System.out.println("there is a static method");
		return 5;
		
	}
	

	public static void main(String[] args) {
		Practicmainmethods obj=new Practicmainmethods();
		
	obj.getvoidMethod();
	getStaticVoid();
	obj.getReturnMethod();
	getStaticRetrunmethod();
	}
}
