package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://preproduccion.everilion.com/ilionp/acceso.asp")
public class LoginPage extends PageObject {

	
	@FindBy(css="input[name='nombre']")
	private WebElementFacade txtName;
	
	@FindBy(css="input[name='contrasenya']")
	private WebElementFacade txtPassword;
	
	@FindBy(css="div#button_enter")
	private WebElementFacade btnEntrar;
	
	public void writeTextName(String term) {
		waitFor(txtName);
		typeInto(txtName, term);
	}
	
	public void writeTextPassword(String term) {
		waitFor(txtPassword);
		typeInto(txtPassword, term);
	}
	
	public void clickEntrar() {
		waitFor(btnEntrar);
		btnEntrar.click();
	}
	
}
