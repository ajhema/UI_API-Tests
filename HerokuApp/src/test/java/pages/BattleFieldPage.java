package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BattleFieldPage {
	WebDriver driver;
	
	@FindBy(linkText = "Go to the office")
	WebElement goToOfficeButton;
	
	public BattleFieldPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getGoToOfficeButton()
    {
        return goToOfficeButton;
    }
	
	public OfficePage clickGoToOfficeButton()
    {
		getGoToOfficeButton().click();
		return new OfficePage(driver);
    }
}
