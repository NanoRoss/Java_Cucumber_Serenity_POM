package pages;

import ReportManager.ReportManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LaunchPage extends PageObject {

    @FindBy(css =  "input[id = 'user-name']")
    private WebElementFacade edt_username;

    @FindBy(css =  "input[id = 'password']")
    private WebElementFacade edt_password;

    @FindBy(css =  "input[id = 'login-button']")
    private WebElementFacade btn_login;


    public void navigateToLaunchPage(){
        getDriver().get("https://www.saucedemo.com/");
        Assert.assertTrue(btn_login.isDisplayed());
        ReportManager.test.info("navigate to landing page")
                .addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"landing page",ReportManager.scenarioName));
    }

    public LaunchPage enterUsername(String username) {
        edt_username.sendKeys(username);
        ReportManager.test.info("enter username,").addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"enter username",ReportManager.scenarioName));
        return this;
    }

    public LaunchPage enterPassword(String password) {
        edt_password.sendKeys(password);
        ReportManager.test.info("enter password")
                .addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"enter password",ReportManager.scenarioName));
        return this;
    }

    public void clickLoginButton() {
        btn_login.click();
    }
}
