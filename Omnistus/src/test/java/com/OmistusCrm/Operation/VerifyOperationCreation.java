package com.OmistusCrm.Operation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Pages.CampaignDetailsPage;
import com.OmistusCrm.Pages.CreateCampaignPage;
import com.OmistusCrm.Pages.DisplayingCustomViewDetailsPage;
import com.OmistusCrm.Pages.EditDetailsPage;
import com.OmistusCrm.Pages.HomePage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;

@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class VerifyOperationCreation extends BaseTest{
	
	@Test
	public void verifyOperationTest() throws Throwable {
	//"Open the browser and enter the test url and Click on Go button" AND VERIFY Login Page

	//	Login to App and verify HOME PAGE
	ValidLoginTest vl=new ValidLoginTest();
	WebDriverCommonLib  wdlib= new WebDriverCommonLib();
	FileLib flib=new FileLib();
	vl.loginToApp();
	wdlib.waitForPage(flib.readPropData(PROP_PATH, "homeTitle"));
	
//	click on operation module 
	HomePage hp= new HomePage() ;
	hp.clickCampaignLink();
	
	//WebDriverCommonLib  wdlib= new WebDriverCommonLib();
	//FileLib flib=new FileLib();
	wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "customViewTitle"), "Custom View Page"); 
	
	//click on New operation button
	DisplayingCustomViewDetailsPage dc=new DisplayingCustomViewDetailsPage();
	dc.clickNewCampaignBtn();
	wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "createCampaignTitle"), "Create Campaign Page");
	
	CreateCampaignPage cc=new CreateCampaignPage();
	cc.enterCampaignName("Srikant");
	cc.clicksavebtn();
	hp.clickCampaignLink();
	Thread.sleep(2000);
	dc.verifyCampaignCreation("Srikant");
	//dc.clickgopiLink();
	//wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "campaignDetailspage"), "CampaignDetails Page");
	//CampaignDetailsPage Cdp=new CampaignDetailsPage();
	//Cdp.clickEditBtn();
	//wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "editCampaignName"), " editDetails Page");
	//EditDetailsPage edp=new EditDetailsPage();
	//edp.enterNumSent("20");
	//Thread.sleep(2000);
	//edp.clickNewSaveBtn();
	
}
}
