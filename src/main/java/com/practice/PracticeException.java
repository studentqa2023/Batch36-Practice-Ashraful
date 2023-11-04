package com.practice;

import java.io.IOException;

public class PracticeException {
	public static void  getFirstMethod(){
		System.out.println("This is the first method");
		
		
	}
	public static void getSecondMehod() {
		int x=5;
		try {
			System.out.println(x/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Arithmetic exception
		
		finally {
			System.out.println("This is finally block");
		}
	}
	public static void getThirdmethod() {
		System.out.println("This is the third method");
		
	}
		public static void getCheckedException() throws InterruptedException,IOException{
			
			Thread.sleep(5000);
		}
			
			
		
	
	
public static void main(String[] args) {
	PracticeException.getFirstMethod();
	PracticeException .getSecondMehod();
	PracticeException .getThirdmethod();
	
}
}
