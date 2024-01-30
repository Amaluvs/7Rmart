package testScript;

import org.testng.annotations.Test;

import pages.DisplayListItemsPage;
import pages.LoginPage;

public class DisplayListItemsTest extends Base
{
	@Test
	public void verifyThatSelectedTileIsDisplayed()
	{
	String tile="Category";
	String username="admin";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	DisplayListItemsPage displaylistitemspage =new DisplayListItemsPage(driver);
    loginpage.enterUserNameOnUserNameField(username);
    loginpage.enterPasswordOnPassworldField(password);
    loginpage.clickonSignInButton();
    displaylistitemspage.clickOnTheMenuInDashboard(tile);
    
}

}
