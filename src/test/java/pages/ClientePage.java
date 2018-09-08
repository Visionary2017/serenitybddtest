package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import utilitario.UrlPages;

@DefaultUrl("https://preproduccion.everilion.com/ilionp/acceso.asp")
public class ClientePage extends PageObject {
	
	UrlPages resource = new UrlPages();
	
	@FindBy(name="rsocial")
	private WebElementFacade txtnombre;
	
	@FindBy(name="fjuridica")
	private WebElementFacade selectfjuridica;
	
	@FindBy(name="ncomercial")
	private WebElementFacade txtncomercial;
	
	@FindBy(name="titular")
	private WebElementFacade txttitular;
	
	@FindBy(name="cif")
	private WebElementFacade txtcif;
	
	@FindBy(name="segsocial")
	private WebElementFacade txtsegsocial;
	
	@FindBy(name="dsn_nominaplus")
	private WebElementFacade txtdsn_nominaplus;
	
	@FindBy(name="contacto")
	private WebElementFacade txtcontacto;
	
	@FindBy(name="sucursal")
	private WebElementFacade selectsucursal;
	
	@FindBy(name="tipo_cliente")
	private WebElementFacade selecttipo_cliente;
	
	@FindBy(name="falta")
	private WebElementFacade dpfecha_alta;
	
	@FindBy(name="estado")
	private WebElementFacade selectestado;
	
	/*Domicilio*/
	@FindBy(name="codpais")
	private WebElementFacade selectcodpais;

	@FindBy(name="codprovincia")
	private WebElementFacade selectcodprovincia;

	@FindBy(name="codpoblacion")
	private WebElementFacade selectcodpoblacion;
	
	@FindBy(name="coddistrito")
	private WebElementFacade selectcoddistrito;
	
	@FindBy(name="domicilio")
	private WebElementFacade txtdomicilio;
	
	/*Datos comerciales*/
	@FindBy(name="divisa")
	private WebElementFacade selectdivisa;
	
	@FindBy(name="comasignado")
	private WebElementFacade selectcomasignado;
	
	@FindBy(name="fpago")
	private WebElementFacade selectfpago;
	
	@FindBy(name="tpago")
	private WebElementFacade selecttpago;
	
	@FindBy(name="zona")
	private WebElementFacade selectzona;
	
	@FindBy(name="tactividad")
	private WebElementFacade selecttactividad;
	
	@FindBy(name="iva")
	private WebElementFacade selectiva;
	
	@FindBy(name="plazoFact")
	private WebElementFacade selectplazoFact;
	
	@FindBy(name="tipoFact")
	private WebElementFacade selecttipoFact;
	
	@FindBy(name="CAMPO23")
	private WebElementFacade selectgrupointeres;
	
	@FindBy(name="saldooffline")
	private WebElementFacade txtsaldooffline;
	
	
	
	@FindBy(id="idsave")
	private WebElementFacade btnSave;
	
	public void loadDataClient() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("pantalla");
		/*Datos Generales*/
		resource.writeText(txtnombre, "PRUEBA AUTO.");
		resource.writeText(txtncomercial, "PRUEBA AUTO.");
		resource.selectText(selectfjuridica, "RUC");
		resource.writeText(txtcif, "20343443961");		
		resource.writeText(txttitular, "");
		resource.writeText(txtsegsocial, "");
		resource.writeText(txtdsn_nominaplus, "");
		resource.writeText(txtcontacto, "Hans Perez");
		resource.selectText(selectsucursal, "Tiki Too");
		resource.selectText(selecttipo_cliente, "Crédito");
		resource.writeText(dpfecha_alta, "4/10/2018");
		resource.selectText(selectestado, "Activo");
		
		/*Domicilio*/
		resource.selectText(selectcodpais, "Perú");
		resource.selectText(selectcodprovincia, "Lima");
		resource.selectText(selectcodpoblacion, "Lima");
		resource.selectText(selectcoddistrito, "Chorrillos");
		resource.writeText(txtdomicilio, "AV. MARQUEZ DE LA BULA");
		
		/*Datos comerciales*/
		resource.selectText(selectdivisa, "S/");
		resource.selectText(selectcomasignado, "JUAN ANTONIO");
		resource.selectText(selectfpago, "30,60 DIAS");
		resource.selectText(selecttpago, "TARJETA VISA");
		resource.selectText(selectzona, "Zona1");
		resource.selectText(selecttactividad, "Car Dealers");
		resource.selectText(selectiva, "18");
		resource.selectText(selectplazoFact, "Mensual");
		resource.selectText(selecttipoFact, "Por EESS");
		resource.selectText(selectgrupointeres, "PRUEBA1");
		resource.writeText(txtsaldooffline, "2,000");
		
	}
	
	public void saveClient() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("botones");
		resource.webElementClick(btnSave);
	}
	
}
