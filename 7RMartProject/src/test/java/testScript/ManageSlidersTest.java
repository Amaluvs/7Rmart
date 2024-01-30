package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSlidersPage;

public class ManageSlidersTest extends Base
{
	@Test
	public void verifyWhetherTheUserIsAddANewItem() throws AWTException
	{
		String username="admin";
		String password="admin";
		String url="https:managersliders";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    ManageSlidersPage managesliderspage =new ManageSlidersPage (driver);
	    managesliderspage.clickOnManageSlidersInfo();
	    managesliderspage.clickonNewButton();
	    managesliderspage.clickOnChooseFile();
	    managesliderspage.clickOnLink(url);
	    managesliderspage.clickOnSaveButton();
	    boolean manageslidersalert=  managesliderspage.alertdisplayed();
	    assertTrue(manageslidersalert," slider not created");
	

}

}
