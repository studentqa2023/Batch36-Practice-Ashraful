package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDrop2 {
	WebDriver driver;
	
public void PracticeDreg() {
	 DriverManager  dm=new  DriverManager ();
	 driver=dm.getDriver(driver);
	 driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	 MasterPageFactory  mpf =new  MasterPageFactory (driver);
		Actions ac =new Actions(driver);
		
		ac.dragAndDrop(mpf.getWashington(), mpf.getUnitedStates()).perform();
}
public static void main(String[] args) {
	PracticeDragAndDrop2 obj=new PracticeDragAndDrop2();
	obj.PracticeDreg();
}
}
