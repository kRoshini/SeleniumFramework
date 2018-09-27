/**
 * 
 */
/**
 * @author BHARAT KUMAR
 *
 */
package com.webElementCommonLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class commonInfor {

@FindBy(xpath="//input[@class='crmbutton small save']")
private WebElement saveBtn;

public void saveButton()
{
	saveBtn.click();
}
}