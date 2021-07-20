package utility;

import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
import pages.*;

public class Game {
	WebDriver driver;
	HomePage homepg;
	BattleFieldPage battlepg;
	OfficePage officepg;
	LeaderBoardPage boardpg;
	
	public void navigationForHomePage()
	  {
	    homepg.navigateToHomePage();
	  }
	
	public void createUser()
	{
		homepg.enterUserInput();
		homepg.clickUserCreateButton();
	}
	
	public void verifyJourneyButton()
	{
		Assert.assertEquals(true, homepg.getUserJourneyButton().isDisplayed());
	}
	
	public void navigationForBattlefildPage()
	{
		homepg.clickUserJourneyButton();
	}
	
	public void completeChallenge()
	{
		battlepg.clickGoToOfficeButton();
		officepg.clickStartButton();
		officepg.clickAnswerButton();	
	}
	
	public void verifyChallengeDone()
	{
		Assert.assertEquals(true, officepg.getScoreButton().isDisplayed());
	}
	
	public void verifyScore()
	{
		officepg.clickScoreButton();
		Assert.assertEquals(true, boardpg.getScoreText().isDisplayed());
	}
}
