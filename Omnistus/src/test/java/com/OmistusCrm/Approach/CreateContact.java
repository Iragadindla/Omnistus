package com.OmistusCrm.Approach;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Operation.ValidLoginTest;
import com.OmistusCrm.Pages.CreateContactPage;
import com.OmistusCrm.Pages.HomePage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;
import com.sun.jdi.event.ThreadDeathEvent;

@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class CreateContact extends BaseTest {
	@Test
	public void VerifyCreateContact() throws Throwable {
		ValidLoginTest vl=new ValidLoginTest();
		WebDriverCommonLib wdlib= new WebDriverCommonLib();
		FileLib flib=new FileLib();
		HomePage hp= new HomePage();
		CreateContactPage ccp= new CreateContactPage();
		vl.loginToApp();
		wdlib.waitForPage(flib.readPropData(PROP_PATH, "homeTitle"));
		hp.clickNewContactLink();
		//wdlib.waitForPage(flib.readPropData(PROP_PATH, "CreateContactPage"));
		//Thread.sleep(2000);
		ccp.EnterFirstname("sowmya");
		ccp.enterAccountNum("9666048347");
		ccp.eneterLastname("rao");
		
		ccp.clickSaveBtn();
	}
	
		
	}

