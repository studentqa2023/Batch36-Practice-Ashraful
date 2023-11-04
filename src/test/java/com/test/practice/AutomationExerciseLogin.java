package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseLogin {

	public void getAutomationExercise() throws InterruptedException {
 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 
			driver.manage().window().maximize();
			
			driver.navigate().to("https://automationexercise.com/");
			
			//Thread.sleep(2000);
			//driver.close();
			driver.findElement(By.xpath("//*[@href='/login']")).click();
			
			driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("karimashraful20@gmail.com");
			
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sakiv1988");
			
			driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
			
	
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		AutomationExerciseLogin obj=new AutomationExerciseLogin();
		obj.getAutomationExercise();
		
	}
}
