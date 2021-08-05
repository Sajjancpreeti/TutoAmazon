package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.java.en.*;

public class Login {

	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException{
		
		Base.driver.get(Base.reader.getUrl());
		Thread.sleep(2000);
		
	}

	@Then("^I Login to the Application$")
	public void i_Login_to_the_Application() throws InterruptedException{
		
		Base.driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(2000);
		Base.driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8073202229");
		Base.driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		Base.driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("IshaaNAyaaN");
		Base.driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);
		
	}

	@And("^I Log out of the Application$")
	public void i_Log_out_of_the_Application() throws InterruptedException{
		
		Actions action2 = new Actions(Base.driver);
		WebElement element2 = Base.driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action2.moveToElement(element2).perform();
		Thread.sleep(8000);
		
		Base.driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
		Thread.sleep(2000);
		
	}

}
