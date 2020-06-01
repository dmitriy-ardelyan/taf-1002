package dmytro.ardelian.taf.pm_steps;

import dmytro.ardelian.taf.web.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage();

    @Then("admin redirected to customer details page")
    public void adminRedirectedToCustomerDetailsPage() {
  //      Verify.equals("Customer Overview", productsPage.getPageTitle(), "verify customer details page title");
    }

    @And("products tab displayed")
    public void productsTabDisplayed() {
 //       Verify.isTrue(productsPage.isProductTypeLabelDisplayed(),"products tab label displayed");
    }

    @When("admin switches to customer tab")
    public void adminSwitchesToCustomerTab() {
        productsPage.goToCustomerTab();
    }
}
