package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadInformationPage {
	@FindBy(name="lastname")
	private WebElement lastNameEdt;
	@FindBy(name="company")
	private WebElement companyNameEdt;
	
	
	public void lastnameInfo()
	{
		lastNameEdt.sendKeys("Roshini");
	}
	public void companyNameInfo()
	{
		companyNameEdt.sendKeys("qspiders");
	}
	

}




