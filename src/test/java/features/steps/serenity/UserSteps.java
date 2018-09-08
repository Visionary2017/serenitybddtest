package features.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import pages.BusquedaPage;
import pages.ProductosPage;

public class UserSteps {
	BusquedaPage busqueda;
	ProductosPage productos;
	
	
	public String getUrl() {
		String currentUrl = busqueda.getDriver().getCurrentUrl();
		return currentUrl;
	}
	
	@Step                                                
    public void abrir_pagina_de_busqueda() {
        busqueda.open();
    }
	
	@Step
	public void buscar_el_termino(String termino) {
		busqueda.writeText(termino);
		busqueda.clickSearch();
	}
	
	@Step
	public void validar_mensaje(String mensaje) {
		assertThat(productos.getMensaje()).startsWith(mensaje);
	}
	
}
