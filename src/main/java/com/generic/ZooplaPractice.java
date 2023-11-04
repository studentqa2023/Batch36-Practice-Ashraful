package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaPractice {

	WebDriver driver; 
	WebDriver wait;
	
	public  void getlogin() {
		 DriverManager  dm=new  DriverManager ();
		 driver=dm.getDriver(driver);
		 driver.navigate().to("https://www.zoopla.co.uk/");
		 MasterPageFactory  mpf =new  MasterPageFactory (driver);
			if(mpf.getAcceptCookiesBtn().size()>0) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 
				 wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn().get(0)));
				 
				mpf.getAcceptCookiesBtn().get(0).click();
				
			}
			mpf.getZooplaLogin().click();
			mpf.getZooplaEmail().sendKeys("rezwanislam@rocketmail.com");
			mpf.getZooplaPassword().sendKeys("Boston2023!");
			mpf.getZooplaSignin2().click();
	}     
	public static void main(String[] args) {
		ZooplaPractice obj=new ZooplaPractice();
		obj.getlogin();
	}
}
