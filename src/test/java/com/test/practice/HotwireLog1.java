package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotwireLog1 {

 public void gethotwireLogin() throws InterruptedException {
	 
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(2000);
	 
		driver.manage().window().maximize();
		
		driver.get("https://www.hotwire.com/");
		
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.xpath("//*[@class='btn__label']")).click();
		 
	 driver.findElement(By.xpath("//*[@class='form-control']")).click();
	 
	 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("karimashraful20@gmail.com");
	 
	 driver.findElement(By.xpath("//*[@class='form-control']")).click();
	 
	 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sakiv1988");
	 
	 driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block']")).click();
	// driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sakiv1988");
	 Thread.sleep(2000);
	 driver.close();
 }
public static void main(String[] args) throws InterruptedException {
	
	HotwireLog1  obj =new HotwireLog1();
	obj.gethotwireLogin();
	
}	
	

		
	}
	

