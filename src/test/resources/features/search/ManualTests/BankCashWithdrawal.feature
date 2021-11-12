@Cucumber
Feature: Bank cash withdrawal
@manual
@manual-result:passed
@manual-test-evidence:assets/first-screenshot.png,assets/second-screenshot.jpg
Scenario: Cash withdrawal
  Given Clive has $1000 in his Current account
  When he withdraws $100 in cash
  Then his remaining balance should be $900

















      
