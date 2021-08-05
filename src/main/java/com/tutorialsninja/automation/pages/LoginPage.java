package com.tutorialsninja.automation.pages;

import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	

	
}
