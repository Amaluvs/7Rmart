package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePaymentMethodPage;

public class ManagePaymentMethodsTest extends Base
{
	@Test
	public void verifyWhetherThepaymentMethodIsInActive()
	{
		String username="admin";
		String password="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
		
	    ManagePaymentMethodPage managepaymentmethodpage=new ManagePaymentMethodPage (driver);
	    managepaymentmethodpage.clickOnManagePaymentMethodInfo();
	    managepaymentmethodpage.clickOnManagePaymentActiveIcon();
	    boolean managepaymentmethodalert= managepaymentmethodpage.alertdisplayed();
	    assertTrue(managepaymentmethodalert,"product status is not changed");
	    
}

}
