package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WikipediaArticle  extends PageObject {
    @FindBy(id = "firstHeading")
    public WebElementFacade articleHeading ;
}


