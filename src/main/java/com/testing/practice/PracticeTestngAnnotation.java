package com.testing.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestngAnnotation {
	@Test
	public void test() {
		System.out.println("This is @test");
	}
	@BeforeSuite
	
	public void BeforeSuit() {
		System.out.println("This is @BeforeSuit");
	}
		@BeforeTest
		public void BeforeTest() {
			System.out.println("This is @BeforeTest");	
	}
		@BeforeClass
		public void BeforeClass() {
			
		
			System.out.println("This is @BeforeClass");
		
		}
		@BeforeMethod
		public void BeforeMethod() {
			
		
			System.out.println("This is @BeforeMethod");
		}
		@AfterTest
		public void aftertestmethod() {
			System.out.println("This is @Aftertestmehod");
		}
	
		@AfterTest
		public void afterSuitmethod() {
			System.out.println("This is @AfterSuittmehod");
		}	
}
