package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;

public class BusquedaSteps {
	
	@Steps
	UserSteps user;
	
	@Given("^Se carga la pagina de busqueda$")
	public void se_carga_la_pagina_de_busqueda() {
        user.abrir_pagina_de_busqueda();
    }

	@When("^Buscamos el termino \"([^\"]*)\"$")
	public void buscamos_el_termino(String termino) {
    	user.buscar_el_termino(termino);
    }

    @Then("^Se muestra el mesaje \"([^\"]*)\"$")
    public void seMuestraElMesaje(String mensaje) throws Throwable {
        user.validar_mensaje(mensaje);
    }
}
