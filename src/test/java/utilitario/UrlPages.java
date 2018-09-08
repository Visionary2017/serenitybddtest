package utilitario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class UrlPages extends PageObject {
	
	public String P_LOGIN = "https://preproduccion.everilion.com/ilionp/acceso.asp";
	public String P_BIENVENIDA = "https://preproduccion.everilion.com/ilionx45/UIPrincipal/init.aspx?empresas=una&ip=0&rf=0&d=";
	
	@FindBy(id="btn_off")
	private WebElementFacade btnClose;
	
	@FindBy(id="button_desactivate")
	private WebElementFacade btnDesactivar;
	
	/*Obtener la Url Actual*/
	public String getCurrent() {
		return getDriver().getCurrentUrl();
	}
	
	/*Logout*/
	public void logout() {
		getDriver().switchTo().defaultContent();
		waitFor(btnClose).click();
		getDriver().switchTo().alert().accept();
	}
	
	/*Liberar usuario de la sesion*/
	public void desactivarUser() {
		waitFor(btnDesactivar).click();
	}
	
	/*Aceptar el alert activa*/
	public void alertAccept() {
		getDriver().switchTo().alert().accept();
	}
	
	/*Url cuando se inicia sesion existente*/
	public String p_desactivado(String userName) {
		return "https://preproduccion.everilion.com/ilionp/desactiva.asp?mode=10&nombre="+userName+"&d=";
	}
	
	/*Timeout para visualizar la pagina*/
	public void waitSeconds(int segundos){
	      synchronized(getDriver()){
	         try {
	        	 getDriver().wait(segundos * 1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	}
	
	/*Alterar los atributos visibles*/
	public void setAttribute(WebElementFacade element, String attName, String attValue) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();   
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
                element, attName, attValue);
    }
	
	/*Seleccionar la ultima ventana*/
	public void selectWindow() {
		for (String handle1 : getDriver().getWindowHandles()) {	 
        	//System.out.println(handle1);
    		getDriver().switchTo().window(handle1);
    	}
	}
	
	/*Cerrar la ventana activa*/
	public void closeWindow() {
		getDriver().close();
	}
	
	public void writeText(WebElementFacade webElement, String value){
		waitFor(webElement);
    	typeInto(webElement, value);
    }
	
	public void webElementClick(WebElementFacade webElement){
    	waitFor(webElement).click();
    }
	
	public void selectText(WebElementFacade webElement, String value) {
		waitFor(webElement);
		Select dropdown = new Select(webElement);
		dropdown.selectByVisibleText(value);
	}
	
}
