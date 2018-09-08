package features.steps.serenity;

import net.thucydides.core.annotations.Step;
import pages.BienvenidaPage;
import pages.ClientePage;
import utilitario.UrlPages;

public class ClienteSteps {
	
	BienvenidaPage bienvenidaPage;
	UrlPages urlPage = new UrlPages();
	
	ClientePage clientePage;
	
	@Step
	public void ingresa_la_opcion_clientes() {
		bienvenidaPage.navegateToCliente();
	}
	
	@Step
	public void filtro_cliente(String term) {
		bienvenidaPage.writeTextSearchValue(term);
	}
	
	@Step
	public void search() {
		bienvenidaPage.searchValue();
	}
	
	@Step
	public void selectClient() {
		bienvenidaPage.selectClientList();
	}
	
	@Step
	public void openWindowTarjeta() {		
		bienvenidaPage.openModalTarjetas();
	}
	
	/***************************************/
	
	@Step
	public void ingresaOpcionClientesP() {
		bienvenidaPage.navegateToClienteP();
	}
	
	@Step
	public void loadClient() {
		clientePage.loadDataClient();
	}
	
	@Step 
	public void saveCliente() {
		clientePage.saveClient();
	}
	
	
	
}
