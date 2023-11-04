package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdwon {
	
	public void getDopDown(){
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		
		Select sc=new Select(driver.findElement(By.xpath("//select")));
		//Select sc =new Select(driver.findElement(By.xpath("//select")));
		
	sc.selectByVisibleText("Cyprus");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.selectByIndex(3);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	sc.selectByValue("AFG");

}
public static void main(String[] args) {
	PracticeDropdwon obj=new PracticeDropdwon();
	obj.getDopDown();
}}
