package starter.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.WikipediaArticle;
import starter.Step.LookForInformation;
import starter.Navigation.NavigateTo;

public class SearchStepDefinitions {
    WikipediaArticle wikipediaArticle;
    @Steps
    NavigateTo navigateTo;
    @Steps
    LookForInformation lookForInformation;
    @Given("{string} is researching things on the internet")
    public void researchingThings(String actor) { navigateTo.Wikipedia(); }
    @When("he looks up {string}")
    public void searchesFor(String term) {
        lookForInformation.About(term);
    }
    @Then("he should see information about {string}")
    public void should_see_information_about(String term) {
        System.out.println(wikipediaArticle.articleHeading.getText());
    }
}
