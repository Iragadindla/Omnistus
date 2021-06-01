package com.OmistusCrm.Operation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Pages.DisplayingCustomViewDetailsPage;
import com.OmistusCrm.Pages.HomePage;
import com.OmistusCrm.Pages.LoginPage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;

@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class verifyAllActiveOperaions extends BaseTest {
	@Test
	public void allActiveOperations() throws Throwable {
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		HomePage hp=new HomePage();
		WebDriverCommonLib wdlib=new WebDriverCommonLib();
		DisplayingCustomViewDetailsPage Dcp= new DisplayingCustomViewDetailsPage();
		
		lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
		wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "homeTitle"),"Home page"); 
		hp.clickCampaignLink();
		Thread.sleep(2000);
		wdlib.verify(wdlib.getPageTitle(),flib.readPropData(PROP_PATH, "customViewTitle"),"custom viewpage");
		Dcp.selectdropdown("31");
		wdlib.getFullScreenshot("C:\\Users\\hp\\git\\repository\\Omnistus\\Screenshots\\AllOperations.png");
		
	}

}
