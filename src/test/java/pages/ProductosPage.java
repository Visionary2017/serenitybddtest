package pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductosPage extends PageObject {

    @FindBy(css = "div.content_price.col-xs-5.col-md-12 span[itemprop='price']")
    private WebElementFacade lblPrice;

    @FindBy(css = "p.alert.alert-warning")
    private WebElementFacade lblMensaje;

    public String getPrice(){
        return lblPrice.getText();
    }

    public String getMensaje(){
        return lblMensaje.getText();
    }
}
