package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.AdminPage;
import com.Automation.Pages.LoginPage;

/*public class LoginTest extends BaseTest {
LoginPage ref = new LoginPage();
AdminPage n = new AdminPage();
@Test
public void verifyLogin() {
	
	ref.OpenWebsite();
	ref.enterUsername("Admin");
	ref.enterPassword("admin123");
	ref.clickLogin();
}
	
@Test(priority=1)
public void VerifyAddUser() throws InterruptedException
{
	 n.Action();
	 Thread.sleep(4000);
	 n.clickLogin_1();
	 n.SelectRole();
	 Thread.sleep(4000);
	n.enterUsername_1("Luke Wright");
	 Thread.sleep(4000);
    n.enterUsername_2("NehaManda");
	n.enterPassword_1("Neha@1232");
	 Thread.sleep(4000);
    n.enterConPassword("Neha@1232");
    Thread.sleep(4000);
	n.Save();
	
}
}*/

public class LoginTest extends BaseTest{
	LoginPage y = new LoginPage();	
	AdminPage n = new AdminPage();
	@Test
	public void verifyLogin() {
		y.OpenWebsite();
		PropertyReader.initProperty();
		y.enterUsername(PropertyReader.getProperty("login.Username"));
		y.enterPassword(PropertyReader.getProperty("login.Password"));
		y.clickLogin();
	}
	@Test(priority=1)
	public void VerifyAddUser() throws InterruptedException
	{
		PropertyReader.initProperty();
		n.Action();
		 Thread.sleep(4000);
		 n.clickLogin_1();
		 n.SelectRole();
		 n.enterUsername_1(PropertyReader.getProperty("admin.name"));
		 n.enterUsername_2(PropertyReader.getProperty("admin.username"));
		 n.enterPassword_1(PropertyReader.getProperty("admin.passkey"));
		 n.enterConPassword(PropertyReader.getProperty("admin.conpasskey"));
		 Thread.sleep(10000);
		 n.Save();
		 
	}
	
	}


