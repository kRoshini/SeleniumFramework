package com.Vtiger.createOpportunityInfoTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CRM.objectRepository.HomePage;
import com.VtigerCRM.genericlib.BaseClass;

public class opportInfo extends BaseClass{
	@Test
	public void createOpp()
	{
		HomePage hp= PageFactory.initElements(driver, HomePage.class);
		hp.navigateToOpportunitiesPage();
	}

}
