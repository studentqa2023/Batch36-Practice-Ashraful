package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comutil.BaseConfig;
import comutil.Highlighter;
import comutil.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLogin {
	@SuppressWarnings("deprecation")
	public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions headlessChrome=new ChromeOptions();
		//headless/gost browser
		headlessChrome.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to( BaseConfig.getConfigValue("QA_URL"));
		
		driver.manage().window().maximize();
		
		 MasterPageFactory  mpf =new  MasterPageFactory (driver);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginBtnHome()));
		 
		 Highlighter.addColor(driver, mpf.getLoginBtnHome());
		mpf.getLoginBtnHome().click();
		
		 Highlighter.addColor(driver, mpf.getEmailfield());
		mpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
		
		 Highlighter.addColor(driver, mpf.getPasswordfild());
		mpf.getPasswordfild().sendKeys(BaseConfig.getConfigValue("password"));
		
		 Highlighter.addColor(driver, mpf.getLoginBtn2());
		mpf.getLoginBtn2().click();
		
		mpf.getLogoutbtn().click();
		Screenshot .getScreenShot(driver, "Homepage_AfterLogin");
		
		if(mpf.getLogoutbtn().isDisplayed()) {
			System.out.println("Login sucessful!");
			
		}
		else {System.out.println("Login failed");
			
		}
	}

}