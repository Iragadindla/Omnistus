package com.OmistusCrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmistusCrm.generic.BaseTest;

public class EditDetailsPage {
	//@FindBy(xpath="//td[@id='mouseArea__Campaign Name']") private WebElement CmpName;
	@FindBy(xpath="//input[@name='property(Num sent)']")private WebElement numSent;
	@FindBy(xpath="//div[text()=' * Required Field(s) ']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	
	

	public EditDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	
	
	public WebElement getNumSent() {
		return numSent;
	}

public void enterNumSent(String numsent) {
	numSent.sendKeys(numsent);
}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void clickNewSaveBtn() {
		saveBtn.click();
	}
}
