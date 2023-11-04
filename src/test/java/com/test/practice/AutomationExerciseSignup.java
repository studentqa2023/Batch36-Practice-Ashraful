package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseSignup {
	public void getAutomationweb() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 
			driver.manage().window().maximize();
			
			driver.navigate().to("https://automationexercise.com/");
			
			//Thread.sleep(2000);
			//driver.close();
			driver.findElement(By.xpath("//*[@href='/login']")).click();
			driver.findElement(By.xpath("//*[@name='name']")).click();
			driver.findElement(By.xpath("//*[@name='name']")).sendKeys("ashraful99");
			
			driver.findElement(By.xpath("//*[@name='email']")).click();
			
			driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("shohag322@yahoo.com");
			
			driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
			Thread.sleep(3000);
			//driver.close();
			//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("karimashraful20@gmail.com");
	}

	public static void main(String[] args) throws InterruptedException {
		AutomationExerciseSignup obj=new AutomationExerciseSignup();
		obj.getAutomationweb();
		
	}
}
