package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfficePage {
    WebDriver driver;
	
	@FindBy(className = "btn btn-primary")
	WebElement startButton;
	
	@FindBy(linkText = "Use your superhero Social Distance and notify your Manager.")
	WebElement answerButton;
	
	@FindBy(id = "leaderboard_link")
	WebElement scoreButton;
	
	public OfficePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getStartButton()
    {
        return startButton;
    }
	
	public WebElement getAnswerButton()
    {
        return answerButton;
    }
	
	public WebElement getScoreButton()
    {
        return scoreButton;
    }
	
	public void clickStartButton()
    {
		getStartButton().click();
    }
	
	public void clickAnswerButton()
    {
		getAnswerButton().click();
    }
	
	public LeaderBoardPage clickScoreButton()
    {
		getScoreButton().click();
		return new LeaderBoardPage(driver);
    }
	
	
}
