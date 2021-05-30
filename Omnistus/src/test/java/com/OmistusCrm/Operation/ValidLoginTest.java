package com.OmistusCrm.Operation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OmistusCrm.Pages.LoginPage;
import com.OmistusCrm.generic.BaseTest;
import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.WebDriverCommonLib;
@Listeners(com.OmistusCrm.generic.MyListeners.class)
public class ValidLoginTest extends BaseTest{
	
	public void loginToApp() throws Throwable {
		LoginPage lp =new LoginPage();
		FileLib fl= new FileLib();
		lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
		WebDriverCommonLib wd =new WebDriverCommonLib();
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "homeTitle"), "Home page");
	}

}