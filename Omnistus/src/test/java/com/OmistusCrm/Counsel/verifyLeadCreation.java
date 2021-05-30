package com.OmistusCrm.Counsel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Operation.ValidLoginTest;
import com.OmistusCrm.Pages.CreateLeadPage;
import com.OmistusCrm.Pages.DisplayingCustomViewDetailsPage;
import com.OmistusCrm.Pages.HomePage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;


@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class verifyLeadCreation extends BaseTest {
	@Test
	public void leadCreation() throws Throwable {
		ValidLoginTest vl=new ValidLoginTest();
		vl.loginToApp();
		HomePage hp=new HomePage() ;
		hp.clickLeadsTab();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();
		wlib.verify(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "customViewTitle"), "Custom View Page");
		
		 DisplayingCustomViewDetailsPage dcp=new  DisplayingCustomViewDetailsPage();
		 dcp.clickNewLead();
		 wlib.verify(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "createLeadTitle"), " Create LeadPage");
		 CreateLeadPage Lp=new CreateLeadPage ();
		 Lp.enterFirstname("sreekanth sree");
		 Lp.EnterCompanyName("TATA");
		 Lp.enterLastname("iragdindla");
		 Lp.clicksaveBtn();
		
		 			
		
	}

}
