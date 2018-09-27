package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class opportunityInfo {
	@FindBy(name="potentialname")
	private WebElement orgNameEdt;
	
	public void orgNameInfo()
	{
		orgNameEdt.sendKeys("jspider");	
	}

}
