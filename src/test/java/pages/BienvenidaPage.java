package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import utilitario.UrlPages;

public class BienvenidaPage extends PageObject {

	UrlPages urlPage = new UrlPages();
	
	@FindBy(id="data_user_right")
	private WebElementFacade lblMensaje;
	
	@FindBy(xpath="//*[@role='menuitem']//*[text()='Ventas']")
	private WebElementFacade mnuVentas;
	
	@FindBy(id="ui-menu-1-0")
	private WebElementFacade sbmnuFormularios;
	
	@FindBy(css="#ui-menu-1-5")
	private WebElementFacade sbmnuClientesNuevoPeru;
	
	@FindBy(css="input#KeySearch.IN_S")
	private WebElementFacade txtSearchValue;
	
	@FindBy(xpath="//*[@id='FILTERS_MASTER_ASP']/a/img")
	private WebElementFacade btnSearch;
	
	@FindBy(id="ui-menu-1-3")
	private WebElementFacade sbmnuFormulariosP;
	
	@FindBy(css="#ui-menu-1-39")
	private WebElementFacade sbmnuClientes;
	
	
	public String getMensaje() {
		//getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//getDriver().getCurrentUrl();
		waitFor(lblMensaje);
		return lblMensaje.getText();
	}
	
	public void navegateToCliente() {
		getDriver().switchTo().defaultContent();
		waitFor(mnuVentas).click();
		waitFor(sbmnuFormularios);
		withAction().moveToElement(sbmnuFormularios).build().perform();
		waitFor(sbmnuClientesNuevoPeru).click();

		//waitFor(ulFormularios);
	    //urlPage.setAttribute(ulFormularios, "style", "display: block;");
	    //waitFor(ulClientes);
	    //urlPage.setAttribute(ulClientes, "style", "display: block;");
	    //btnClientes.click();
		
	}
	
	public void navegateToClienteP() {
		
		getDriver().switchTo().defaultContent();
		waitFor(mnuVentas).click();
		waitFor(sbmnuFormulariosP);
		withAction().moveToElement(sbmnuFormulariosP).build().perform();
		//withAction().moveToElement(sbmnuClientes).click().build().perform();
		waitFor(sbmnuClientes).click();
		
	}
	
	public void writeTextSearchValue(String term) {
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("botones");
		getDriver().findElement(By.xpath("//*[@id='KeySearch']")).sendKeys(term);
		typeInto(txtSearchValue, term);
	}
	
	public void searchValue() {
		waitFor(btnSearch);
		btnSearch.click();
	}
	
	public void selectClientList() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("left");
		getDriver().findElement(By.xpath("/html/body/form/div/table/tbody/tr[2]/td[1]/div/a")).click();
	}
	
	public void openModalTarjetas() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("pantalla");
		getDriver().findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/div[14]/div[1]/a")).click();
	}
	
}
