package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage {
@FindBy(xpath="//img[@title='Create Lead...']")
private WebElement createLeadlnk;

public void createLeads()
{
	createLeadlnk.click();
}
}
