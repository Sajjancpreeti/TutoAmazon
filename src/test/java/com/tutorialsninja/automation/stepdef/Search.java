package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.By;
import com.tutorialsninja.automation.base.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Search {
	
	@Then("^Search for the product$")
	public void search_for_the_product() throws InterruptedException{
		
		Base.driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone");
		Thread.sleep(2000);
		Base.driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
	}

	@And("^Sort the value from low to high$")
	public void sort_the_value_from_low_to_high() throws InterruptedException{
		
		Base.driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		Thread.sleep(2000);
		Base.driver.findElement(By.xpath("//a[normalize-space()='Price: Low to High']")).click();
		Thread.sleep(2000);
		
		
	}
}