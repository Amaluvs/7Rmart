package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtilities;

public class ManagePaymentMethodPage
{
	WebDriver driver;
	public ManagePaymentMethodPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = " //p[text()='Manage Payment Methods']//parent::a")WebElement managepaymentmethodinfo;
	@FindBy(xpath = "(//span[@class='badge bg-success'])[1]")WebElement activebutton;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")WebElement alert;
    public void clickOnManagePaymentMethodInfo()
    {
    	 managepaymentmethodinfo.click();	
    }
    public void clickOnManagePaymentActiveIcon()
    {
    	WaitUtilities waitutitlities = new WaitUtilities();
    	waitutitlities.waitForElementToBeClickable(driver,activebutton );
    	PageUtilities pageutility=new PageUtilities();
    	pageutility.javaSriptClick(driver,activebutton);
    	
    }
    
    public boolean alertdisplayed()
	{
    	// WaitUtilities waitutility=new WaitUtilities();
    //	waitutility.waitForAlertToBeVisible(driver,alert);
		return alert.isDisplayed();
	}
	
	

}
