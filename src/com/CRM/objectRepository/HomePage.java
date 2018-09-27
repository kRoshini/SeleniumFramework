package com.CRM.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="Calendar")
	private WebElement callnk;
	@FindBy(linkText="Leads")
	private WebElement leadslnk;
	@FindBy(linkText="Organizations")
	private WebElement orgslnk;
	@FindBy(linkText="Contacts")
	private WebElement contactslnk;
	@FindBy(linkText="Opportunities")
	private WebElement opportlnk;
	@FindBy(linkText="Products")
	private WebElement productslnk;
	@FindBy(linkText="Documents")
	private WebElement docslnk;
	@FindBy(linkText="Email")
	private WebElement emaillnk;
	@FindBy(linkText="Trouble Tickets")
	private WebElement Troubletcklnk;
	@FindBy(linkText="Dashboard")
	private WebElement dashlnk;
	
	public void navigateToCalendarPage()
	{
		callnk.click();
	}
	
	public void navigateToLeadsPage()
	{
		leadslnk.click();
	}
	public void navigateToOrganizationPage()
	{
		orgslnk.click();
	}
	public void navigateToContactsPage()
	{
		contactslnk.click();
	}
	public void navigateToOpportunitiesPage()
	{
		opportlnk.click();
	}
	public void navigateToProductsPage()
	{
		productslnk.click();
	}
	public void navigateToDocumentsPage()
	{
		docslnk.click();
	}
	public void navigateToEmailPage()
	{
		emaillnk.click();
	}
	public void navigateToTroubleTicketsPage()
	{
		Troubletcklnk.click();
	}
	public void navigateToDashboardPage()
	{
		dashlnk.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
