package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	@FindBy(id = "worrior_username")
	WebElement userInputField;
	
	@FindBy(id = "warrior")
	WebElement userCreateButton;
	
	@FindBy(linkText = "Start your journey")
	WebElement userJourneyButton;
	
	public HomePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getUserInputField()
    {
        return userInputField;
    }
	
	public WebElement getUserCreateButton()
    {
        return userCreateButton;
    }
	
	public WebElement getUserJourneyButton()
    {
        return userJourneyButton;
    }
	
	public void navigateToHomePage()
	{
	        System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
	        driver.navigate().to("https://responsivefight.herokuapp.com/");
	}
	
	public void enterUserInput()
    {
		getUserInputField().sendKeys("TestUser");
    }
	
	public void clickUserCreateButton()
    {
		getUserCreateButton().click();
    }
	
	public BattleFieldPage clickUserJourneyButton()
    {
		getUserJourneyButton().click();
		return new BattleFieldPage(driver);
    }

}
