package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PushNotificationsPage;

public class PushNotificationsTest extends Base
{
	@Test
	public void verifyWhetherTheUserIsAddANewLocation()
	{

		String username="admin";
		String password="admin";
		String title=" sale";
		String description="10% discount on every product";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    PushNotificationsPage  pushnotificationspage =new PushNotificationsPage (driver);
	    pushnotificationspage.pushNotificationInfo();
	    pushnotificationspage.pushNotificationTitle(title);
	    pushnotificationspage.pushNotificationDescription(description);
	    pushnotificationspage.pushNotificationSendButton();
	     boolean pushalert=pushnotificationspage .ispushNotificationDisplayed();
	     assertTrue(pushalert,"unable to send the push notification");
    }
}


