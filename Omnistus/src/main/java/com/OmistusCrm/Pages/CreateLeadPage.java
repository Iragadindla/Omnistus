package com.OmistusCrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmistusCrm.generic.BaseTest;

public class CreateLeadPage {
	@FindBy(xpath="//input[@name='property(First Name)']")private WebElement firstNameText;
	@FindBy(xpath="//div[text()='* Required Field(s)']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	@FindBy(xpath="//input[@name=\"property(Company)\"]")private WebElement companyText;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNme;
	
	public CreateLeadPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}
	
	public void enterFirstname(String firstname) {
		firstNameText.sendKeys(firstname);
	}
	

	public WebElement getCompanyText() {
		return companyText;
	}
public void EnterCompanyName(String companyname) {
	companyText.sendKeys(companyname);
}

	public WebElement getLastNme() {
	return lastNme;
}
	public void enterLastname(String lastname) {
		lastNme.sendKeys(lastname);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clicksaveBtn() {
		saveBtn.click();
	}
	
 
}
