package starter.Navigation;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.WikipediaHomePage;


public class NavigateTo extends ScenarioActor {
    @Steps(shared = true)
    WikipediaHomePage wikipediaHomePage;

    @Step("Navegar a la url https://wikipedia.org")
    public void Wikipedia() {
        wikipediaHomePage.setDefaultBaseUrl("https://wikipedia.org");
        wikipediaHomePage.open();
    }
}
