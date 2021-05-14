package StepDefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Google.GoogleSearch_page;


public class SearchInGoogle_steps {

    @Page //Al usar Serenity no me hace falta instanciar la clase Page.
    GoogleSearch_page googleSearch_page;


    @Managed
    WebDriver driver;


    @Given("Iam on the google search page")
    public void iamOnTheGoogleSearchPage() {
        googleSearch_page.navigateToGoogle("https://www.google.com/");
    }

    @When("I enter the search criteria")
    public void iEnterTheSearchCriteria() {
        googleSearch_page.enterSearchCriteria("Mariano Panella");
    }

    @When("Click in the search button")
    public void clickInTheSearchButton() {
        googleSearch_page.clickGoogleSearch();
    }

    @Then("The result match the criteria")
    public void theResultMatchTheCriteria() {
        Assert.assertTrue(googleSearch_page.textForElement_firstResult().contains("Mariano Panella"));
    }

}
