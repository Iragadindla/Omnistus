package com.OmistusCrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmistusCrm.generic.BaseTest;

public class CampaignDetailsPage {
	@FindBy(xpath="//td[@id='mouseArea__Description']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Edit']")
	private WebElement EditBtn;
	//@FindBy(xpath="//td[@id='mouseArea__Description']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Delete']")
	private WebElement deleteBtn;
	//@FindBy(xpath="//td[@id='mouseArea__Campaign Name']") private WebElement CmpName;
	
	public  CampaignDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public WebElement getEditBtn() {
		return EditBtn;
	}
public void clickEditBtn() {
	EditBtn.click();
	
}


}

