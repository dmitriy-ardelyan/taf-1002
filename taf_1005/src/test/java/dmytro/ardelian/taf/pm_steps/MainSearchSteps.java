package dmytro.ardelian.taf.pm_steps;

import dmytro.ardelian.taf.web.pages.MainSearchPage;
import io.cucumber.java.en.When;

public class MainSearchSteps {
    MainSearchPage mainSearchPage = new MainSearchPage();

    @When("admin performs search by {string}")
    public void adminPerformsSearchBy(String email)  {
        mainSearchPage.setEmail(email);
        mainSearchPage.clickSearch();
    }
}
