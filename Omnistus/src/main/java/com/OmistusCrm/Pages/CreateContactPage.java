package com.OmistusCrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmistusCrm.generic.BaseTest;

public class CreateContactPage {
@FindBy(xpath="//input[@name='property(First Name)']")private WebElement FirstName;
@FindBy(xpath="//input[@name='property(Account Name)']")private WebElement AccountName;
@FindBy(xpath="//input[@name='property(Last Name)']")private WebElement Lastname;
@FindBy(xpath="//input[@name='property(Email)']")private WebElement EmailText;
@FindBy(xpath="//div[text()='* Required Field(s)']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Save']")
private WebElement saveBtn;
public CreateContactPage() {
	PageFactory.initElements(BaseTest.driver, this);	
}

public WebElement getFirstName() {
	return FirstName;
}
public void EnterFirstname(String firstname) {
	FirstName.sendKeys(firstname);
}

public WebElement getAccountName() {
	return AccountName;
}
public void enterAccountNum(String account) {
	AccountName.sendKeys(account);
}

public WebElement getLastname() {
	return Lastname;
}
public void eneterLastname(String lastname) {
	Lastname.sendKeys(lastname);
}

public WebElement getEmailText() {
	return EmailText;
}
public void EnterEmail(String email) {
	EmailText.sendKeys(email);
}

public WebElement getSaveBtn() {
	return saveBtn;
}
public void clickSaveBtn() {
	saveBtn.click();
	
}
}
