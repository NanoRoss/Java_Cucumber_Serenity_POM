package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject {


   @FindBy(css = "span[class='title']")
   private WebElementFacade lbl_products;

   @FindBy(css = "div[class = 'error-message-container error'] h3")
   private WebElementFacade lbl_error;


    public void validarHomePage() {
        Assert.assertEquals("products",this.lbl_products.getText().toLowerCase());

    }

    public void validarErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage,lbl_error.getText());
    }
}
