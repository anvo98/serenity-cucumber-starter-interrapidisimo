package starter.Step;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.WikipediaSearchForm;

public class LookForInformation extends ScenarioActor {
    @Steps(shared = true)
    WikipediaSearchForm searchForm;

    @Step("Look for information about term")
    public void About(String term) {
        searchForm.searchField.sendKeys(term);
        searchForm.button.click();

    }
}
