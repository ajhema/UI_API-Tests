package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaderBoardPage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"showData\"]/table/tbody/tr[2]/td[3]")
	WebElement scoreText;
	
	public LeaderBoardPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getScoreText()
    {
        return scoreText;
    }
	
	
}
