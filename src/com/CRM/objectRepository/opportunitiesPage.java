package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class opportunitiesPage {
	public class LeadsPage {
		@FindBy(xpath="//img[@title='Create Opportunity...']")
		private WebElement createOpportlnk;

public void createOpportunity()
{
	createOpportlnk.click();
	
}

}
	}
