package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatoinExercise {
	public void getAutomationValue() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://automationexercise.com/");
		
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//*[@ name='email'])[1]")).sendKeys("karimashraful20@gmail.com");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sakiv1988");
		
		//driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	public static void main(String[] args) {
		
		AutomatoinExercise obj = new AutomatoinExercise();
		obj.getAutomationValue();
		
	}
}
