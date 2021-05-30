package com.OmistusCrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmistusCrm.generic.BaseTest;

public class HomePage {
	
//	we are storing the element's address of home page here
	//Declaration
//	@FindBy(locatorName="locatorValue") accessSpecifier ReturnType elementName;
	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement campaignsLink;
	@FindBy(xpath="//a[text()='Leads']")private WebElement LeadsLink;
	@FindBy(xpath="//a[text()='New Contact']")private WebElement NewContactLink;
	
	

	//Initialization
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

//Utilization
	//Address returning method
	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	
	//Action performing method
	public void clickCampaignLink()
	{
		campaignsLink.click();
	}

	public WebElement getLeadsLink() {
		return LeadsLink;
	}
	public void clickLeadsTab() {
		LeadsLink.click();
	}

	public WebElement getNewContactLink() {
		return NewContactLink;
	}
	public void clickNewContactLink() {
		NewContactLink.click();
	}
}
