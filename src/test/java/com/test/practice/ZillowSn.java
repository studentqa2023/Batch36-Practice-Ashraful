package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class ZillowSn {
	
 public void getZillowlLog() throws InterruptedException {
	 
	 	 
  WebDriver driver= new ChromeDriver();
	 Thread.sleep(2000);
	 
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.xpath("//*[@id='page-header-container']/header/nav/div[2]/ul[4]/li[1]/a/div")).click();
      driver.findElement(By.xpath("//*[@id=\'reg-login-email\']")).click();
      driver.findElement(By.xpath("//*[@id=\'reg-login-email\']")).sendKeys("karimashraful20@gmail.com");
}
 public static void main(String[] args) throws InterruptedException {
	 
	 ZillowSn obj= new ZillowSn();
	 obj.getZillowlLog();
}

}
