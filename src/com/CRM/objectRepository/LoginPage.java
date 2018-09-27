package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage 
{
	
	@FindBy(name="user_name")
	private WebElement userEdt;
	@FindBy(name="user_password")
	private WebElement passwdEdt;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public void loginToApp()
	{
		userEdt.sendKeys("username");
		passwdEdt.sendKeys("password");
		loginBtn.click();
	}
	
	
	

}
