package pages.Google;

import ReportManager.ReportManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch_page extends PageObject {

    @FindBy(xpath = "//*[@name=\"q\"]")
    private WebElementFacade searchTextField;

    @FindBy(xpath = "(//*[@class=\"gNO89b\"])[1]")
    private WebElementFacade searchButton;

    @FindBy(xpath ="(//*[@class=\"LC20lb DKV0Md\"])[1]")
    private WebElementFacade firstResult;


    public void navigateToGoogle(String URL){
        getDriver().get(URL);
    }

    public void clickGoogleSearch(){
        searchButton.click();
        ReportManager.test.info("clickGoogleSearch()").addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"clickGoogleSearch()",ReportManager.scenarioName));
    }

    public void enterSearchCriteria(String criteria){
        searchTextField.clear();
        searchTextField.sendKeys(criteria);
        ReportManager.test.info("enterSearchCriteria()").addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"enterSearchCriteria()",ReportManager.scenarioName));
    }

    public String textForElement_firstResult(){
        ReportManager.test.info("textForElement_firstResult()").addScreenCaptureFromPath(ReportManager.takeStepScreenshot(getDriver(),"textForElement_firstResult()",ReportManager.scenarioName));
        return firstResult.getText().toString();

    }
}
