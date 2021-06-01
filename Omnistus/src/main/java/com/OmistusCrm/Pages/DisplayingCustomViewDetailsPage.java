package com.OmistusCrm.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.OmistusCrm.generic.BaseTest;


public class DisplayingCustomViewDetailsPage {
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement NewCampaignBtn;
	@FindBy(xpath = "//table[@class='secContent']//tbody//tr[*]//td[@class=\"tableData\"][3]")
	private List<WebElement> campaignList;
	@FindBy(xpath = "//input[@value= 'New Lead']")private WebElement NewLeadBtn;
	@FindBy(xpath="//a[text()='Gopi_123']")private WebElement gopilink;
	
	@FindBy(xpath="//select[@name='cvid']")private WebElement status;
    @FindBy(xpath="//a[text()='Raghav']")private WebElement RaghavLink;
	
	public DisplayingCustomViewDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);

	}

	public WebElement getNewCampaignBtn() {
		return NewCampaignBtn;
	}

	public void clickNewCampaignBtn() {
		NewCampaignBtn.click();

	}

	public List<WebElement> getCampaignList() {
		return campaignList;
	}

	public void verifyCampaignCreation(String campaign) {
		for (WebElement oneCampaign : campaignList) {
			String campaignName = oneCampaign.getText();
			if (campaignName.equals(campaign)) {
				Reporter.log("Our Campaign is Created", true);
				break;
			} else {
				Reporter.log("Our Campaign is not Created", true);
			}
		}

	}
	

	public WebElement getStatus() {
		return status;
	}
	public void selectdropdown(String Value) {
		Select select=new Select(status);
		select.selectByValue(Value);
	}

	

	public WebElement getNewLeadBtn() {
		return NewLeadBtn;
	}

	public void clickNewLead() {
		NewLeadBtn.click();
	}

	public WebElement getRaghavLink() {
		return RaghavLink;
	}
public void clickRaghav() {
	RaghavLink.click();
}
public WebElement getGopilink() {
	return gopilink;
}
public void clickonGopi() {
	gopilink.click();
}
}
