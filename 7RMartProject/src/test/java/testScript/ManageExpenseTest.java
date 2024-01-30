package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageExpensePage;
import utilities.ExcelUtilities;

public class ManageExpenseTest extends Base
{
	@Test
	public void verifyWhetherTheUserIsAddANewProductInformation() throws AWTException
	{
		String username=ExcelUtilities.getString(1, 0,"loginpage");
		String password=ExcelUtilities.getString(1,1,"loginpage");
	    String date="10/8/23";
	    String amount="hundread";
	    String remarks=" imported icecream";
	    LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
        ManageExpensePage manageexpensepage =new ManageExpensePage (driver);
        manageexpensepage.clickOnManageExpenseInfo();
        manageexpensepage.clickOnNewButton();
        manageexpensepage.clickOnUserField();
        manageexpensepage.clickOnDateField(date);
        manageexpensepage.clickOncategoryField();
        manageexpensepage.clickOnOrderId();
        manageexpensepage.clickOnPurchaseId();
        manageexpensepage.clickOnExpenseType();
        manageexpensepage.clickOnAmountField(amount);
        manageexpensepage.clickOnRemarks(remarks);

        manageexpensepage.clickOnchoosefile();
        manageexpensepage.clickOnSaveButton();
        boolean isnewinformationadded= manageexpensepage.isManageExpensePageDisplayed();
	    assertTrue(isnewinformationadded,"expense record  not created");
        
	
	}

}
