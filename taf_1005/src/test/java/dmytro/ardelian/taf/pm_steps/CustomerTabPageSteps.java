package dmytro.ardelian.taf.pm_steps;

import dmytro.ardelian.taf.assertions.Verify;
import dmytro.ardelian.taf.web.pages.CustomerTabPage;
import io.cucumber.java.en.Then;

public class CustomerTabPageSteps {

    CustomerTabPage customerTabPage = new CustomerTabPage();

    @Then("customer email is {string}")
    public void customerEmailIs(String email) {
        Verify.equals(email, customerTabPage.getCustomerEmail(), " customer email is");
    }
}
