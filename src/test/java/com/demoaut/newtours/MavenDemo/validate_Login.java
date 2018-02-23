package com.demoaut.newtours.MavenDemo;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class validate_Login extends BaseTest {

	@Test
	public void validateLogin() {

		Login ll = new Login(driver);
		ll.login_App("mercury", "mercury");

		//boolean signOff = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		//Assert.assertTrue(signOff);
		
		if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
			System.out.println("Home Page is Displayed");
			
		}
		else{
			System.out.println("Home Page is not displayed");
		}

	}

}
