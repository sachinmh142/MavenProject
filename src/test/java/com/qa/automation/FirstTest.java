package com.qa.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {


 
	 WebDriver driver;
	 
	 @Test
	 public void navigateToGoogle() throws InterruptedException
	 {
		 driver=WebDriverManager.chromedriver().create();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(10);
		 
		 driver.quit();
	 }
	 
}
