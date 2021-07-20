package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Game;

public class GameStepDefinition {
	Game covid19;
	@Given("^I have navigated to home page$")
	public void i_have_navigated_to_home_page()
	{
		covid19.navigationForHomePage();
	}
	
	@When("^I create user warrior$")
	public void i_create_user_warrior()
	{
		covid19.createUser();
	}
	
	@Then("^user warrior is created$")
	public void user_warrior_is_created()
	{
		covid19.verifyJourneyButton();
	}
	
	@Given("^I have navigated to battlefield page$")
	public void i_have_navigated_to_battlefield_page()
	{
		covid19.navigationForBattlefildPage();
	}
	
	@When("^I complete the challenge$")
	public void i_complete_the_challenge()
	{
		covid19.completeChallenge();
	}
	
	@Then("^I can go to leaderboard page$")
	public void i_can_go_to_leaderboard_page()
	{
		covid19.verifyChallengeDone();
	}
	
	@And("^final score is verified$")
	public void final_score_is_verified()
	{
		covid19.verifyScore();
	}
}

