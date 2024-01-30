package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;

public class ManagePagesTest extends Base
{
	@Test
	public void verifyWhetherTheUserIsUpdatedAPage() throws AWTException
	{
		String username="admin";
		String password="admin";
		String title="Book";
	    String descripton="costly books";
	    String page="ten";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    ManagePagesPage managepagespage =new ManagePagesPage(driver);
	    managepagespage.clickOnManagePagesInfo();
	    managepagespage.clickOnEditButton();
	    managepagespage.clickOnManagePagesTitle(title);
	    managepagespage.clickOnManagePagesDescription(descripton);
	    managepagespage.clickOnManagePagesPage(page);
        managepagespage.clickOnManagePagesImageUpload();
	    managepagespage.clickOnManagePagesUpdateButton();
	    boolean managepagealert= managepagespage.isManagepagesAlertDisplayed();
	    assertTrue(managepagealert," page updation is failed");
}


}
