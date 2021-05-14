package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LaunchPage;

public class LogInLogOff_steps {

    @Page //Al usar Serenity no me hace falta instanciar la clase Page.
    HomePage homePage;
    LaunchPage launchPage;

    @Managed
    WebDriver driver;

    @Given("User navigates to launch page")
    public void userNavigatesToLaunchPage() {
        launchPage.navigateToLaunchPage();
    }
    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        launchPage.enterUsername(username).enterPassword(password).clickLoginButton();
    }
    @Then("User validates correct login")
    public void userValidatesCorrectLogin() {
        homePage.validarHomePage();
    }

    @Then("User validates error message {string}")
    public void userValidatesErrorMessage(String errorMessage) {
        homePage.validarErrorMessage(errorMessage);
    }
}
