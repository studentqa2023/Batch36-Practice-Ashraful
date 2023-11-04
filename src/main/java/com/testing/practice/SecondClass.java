package com.testing.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.MasterPageFactory;

import comutil.BaseConfig;
import comutil.Highlighter;
import comutil.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass {
	@Test
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
		
		
		}
	}




