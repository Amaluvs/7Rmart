package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayListItemsPage
{
	WebDriver driver;
	public DisplayListItemsPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	@FindBy(xpath = "//div[contains(@class,'small')]//child::div[@class='inner']") List<WebElement> menuList;
	@FindBy(xpath = "//a[@class='small-box-footer']") List<WebElement> menuLink;

	public void clickOnTheMenuInDashboard(String menuToBeClicked) {
		int menuIndex;
		for (WebElement menuItem : menuList) {
			menuIndex = menuList.indexOf(menuItem);
			if(menuIndex!=-1 && menuItem.getText().contains(menuToBeClicked)) {
				menuLink.get(menuIndex).click();
				break;
			}
		}
		}

}
