package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class MasterPageFactory {
	public  MasterPageFactory (WebDriver driver) {
		PageFactory.initElements(driver, this);// handle the null point exception
	}
	
	@FindBy(xpath="//*[@class='fa fa-lock']")
	
private WebElement loginBtnHome;

	public WebElement getLoginBtnHome() {
		return loginBtnHome;
	}
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailfield;
	
@FindBy(xpath="//*[@name='password']")
	private WebElement passwordfild;

@FindBy(xpath="(//*[@class='btn btn-default'])[1]")
private WebElement loginBtn2;
@FindBy(xpath ="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a" )
private WebElement logoutbtn;

@FindBy(xpath = "(//a[contains(text(),'Services')])[1]")
private WebElement services;

@FindBy(xpath ="(//div[contains(text(),'Oslo')])[2]")
private WebElement dragolso;

@ FindBy(xpath = "//div[contains(text(),'Norway')and @id='box101']")
private WebElement dropNorway;

@FindBy(xpath = "//div[contains(text(),'Washington')and @id='box3']")
private WebElement Washington;
@FindBy(xpath = "//div[contains(text(), 'United States')]")
private WebElement unitedStates;

@FindBy(xpath = "//span[contains(text(), 'Accept all cookies')]")
private List<WebElement >AcceptCookiesBtn;
@FindBy(xpath = "(//span[contains(text(), 'Sign in')])[2]")
private WebElement zooplaLogin;
@FindBy(xpath ="//input[@id='email']" )
private WebElement zooplaEmail;
@FindBy(xpath = "//input[@id='current-password']")
private WebElement zooplaPassword;
@FindBy(xpath = "//button[@class='_1erwn750 1erwn751 1erwn752 1erwn75a 1dgm2fc8']")
private WebElement zooplaSignin2;



public WebElement getZooplaEmail() {
	return zooplaEmail;
}

public WebElement getZooplaPassword() {
	return zooplaPassword;
}

public WebElement getZooplaSignin2() {
	return zooplaSignin2;
}

public WebElement getZooplaLogin() {
	return zooplaLogin;
}

public WebElement getWashington() {
	return Washington;
}

public List<WebElement> getAcceptCookiesBtn() {
	return AcceptCookiesBtn;
}

public WebElement getUnitedStates() {
	return unitedStates;
}

public WebElement getDragolso() {
	return dragolso;
	
}

public WebElement getDropNorway() {
	return dropNorway;
}

public WebElement getServices() {
	return services;
}

public WebElement getEmailfield() {
	return emailfield;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public WebElement getPasswordfild() {
	return passwordfild;
}

public WebElement getLoginBtn2() {
	return loginBtn2;
}


	}
	


