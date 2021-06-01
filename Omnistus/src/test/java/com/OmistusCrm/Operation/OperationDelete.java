package com.OmistusCrm.Operation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Pages.CampaignDetailsPage;
import com.OmistusCrm.Pages.DisplayingCustomViewDetailsPage;
import com.OmistusCrm.Pages.HomePage;
import com.OmistusCrm.Pages.LoginPage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;

@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class OperationDelete extends BaseTest {
	@Test
	public void deleteOperation() throws Throwable {
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		WebDriverCommonLib wdlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();
		CampaignDetailsPage Cdp= new CampaignDetailsPage();
		DisplayingCustomViewDetailsPage Dcp= new DisplayingCustomViewDetailsPage();
		lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
		wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "homeTitle"),"Home Page");
		hp.clickCampaignLink();
		//wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "customViewTitle"),"custom Page");
       // wdlib.waitForPage(flib.readPropData(PROP_PATH,"campaignDetailspage"));
		Dcp.clickonGopi();
		wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "campaignDetailspage"),"campaigndetails Page");
		Cdp.clickDeliteBtn();
		wdlib.switchToPopupAndClickonOkBtn();
		Thread.sleep(2000);
		wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "customViewTitle"),"custom Page");
		
	}
	

}
