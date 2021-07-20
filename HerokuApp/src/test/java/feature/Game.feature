@tag1
Scenario Outline: Create user warrior
Given I have navigated to home page
When I create user warrior
Then user warrior is created

@tag2
Scenario Outline: Complete challenge in battlefield
Given I have navigated to battlefield page
When I complete the challenge
Then I can go to leaderboard page
And final score is verified
