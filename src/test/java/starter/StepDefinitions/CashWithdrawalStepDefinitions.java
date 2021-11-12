package starter.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CashWithdrawalStepDefinitions {
    @Given("Clive has ${int} in his Current account")
    public void clive_has_$_in_his_current_account(Integer int1) {
    }
    @When("he withdraws ${int} in cash")
    public void he_withdraws_$_in_cash(Integer int1) {
    }
    @Then("his remaining balance should be ${int}")
    public void his_remaining_balance_should_be_$(Integer int1) {
    }
}
